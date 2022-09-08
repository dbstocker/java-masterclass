public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("David", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(300);
//        calculateScore();

        calcFeetAndInchesToCentimeters(6, -10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double result = -1;
        if (inches >= 0.0) {
            result = inches * 2.54;
        }
        System.out.println(result);
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double result = -1;
        double feetInCentimeters;
        double inchesInCentimeters;
        if ((inches >= 0.0 || inches < 12.0) && feet >= 0.0) {
            feetInCentimeters = calcFeetAndInchesToCentimeters((feet * 12));
            inchesInCentimeters = calcFeetAndInchesToCentimeters(inches);
            result = feetInCentimeters + inchesInCentimeters;
        }
        System.out.println(result);
        return result;
    }
}