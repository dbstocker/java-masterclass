package challenges;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean winterPlay;
        boolean summerPlay;

        winterPlay = (temperature > 24 && temperature < 36);
        summerPlay = (summer && temperature > 24 && temperature < 46);

        return (winterPlay || summerPlay);
    }
}
