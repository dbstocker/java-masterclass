public class Main {
    public static void main(String[] args) {
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore;
        boolean gameOver = true;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }
}