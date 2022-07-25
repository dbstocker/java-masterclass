public class Main {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score is " + highScore);

        highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score is " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
        }
        return finalScore;
    }
}