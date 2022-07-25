public class Main {
    public static void main(String[] args) {
        String bob = "Bob";
        int bobScore = 50;
        String julie = "Julie";
        int julieScore = 400;
        String jack = "Jack";
        int jackScore = 900;
        String meg = "Meg";
        int megScore = 1500;

        int bobPos = calculateHighScorePosition(bobScore);
        displayHighScorePosition(bob, bobPos);
        int juliePos = calculateHighScorePosition(julieScore);
        displayHighScorePosition(julie, juliePos);
        int jackPos = calculateHighScorePosition(jackScore);
        displayHighScorePosition(jack, jackPos);
        int megPos = calculateHighScorePosition(megScore);
        displayHighScorePosition(meg, megPos);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " achieved position " + position + " in the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        int position;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500 && score < 1000) {
            position = 2;
        } else if (score >= 100 && score < 500) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}