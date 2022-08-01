package challenges;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        boolean teen = false;
        int[] args = {first, second, third};
        for (int arg : args) {
            if (isTeen(arg)) {
                teen = true;
                break;
            }
        }
        System.out.println(teen);
        return teen;
    }

    public static boolean isTeen(int num) {
        return num > 12 && num < 20;
    }
}
