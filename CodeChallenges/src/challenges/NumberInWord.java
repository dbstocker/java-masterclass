package challenges;

public class NumberInWord {
    public static void printNumberInWord(int num) {
        String print;

        switch (num) {
            case 0:
                print = "ZERO";
                break;
            case 1:
                print = "ONE";
                break;
            case 2:
                print = "TWO";
                break;
            case 3:
                print = "THREE";
                break;
            case 4:
                print = "FOUR";
                break;
            case 5:
                print = "FIVE";
                break;
            case 6:
                print = "SIX";
                break;
            case 7:
                print = "SEVEN";
                break;
            case 8:
                print = "EIGHT";
                break;
            case 9:
                print = "NINE";
                break;
            default:
                print = "OTHER";
        }

        System.out.println(print);
    }
}
