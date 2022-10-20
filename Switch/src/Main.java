public class Main {
    public static void main(String[] args) {
        int value = 99;

        /*switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was neither 1 nor 2");
                break;
        }*/

        char ch = 'C';

        switch (ch) {
            case 'A':
                System.out.println("Value was 'A'");
                break;
            case 'B':
                System.out.println("Value was 'B'");
                break;
            case 'C':
                System.out.println("Value was 'C'");
                break;
            case 'D':
                System.out.println("Value was 'D'");
                break;
            case 'E':
                System.out.println("Value was 'E'");
                break;
            default:
                System.out.println("Value not found");
                break;
        }
    }
}