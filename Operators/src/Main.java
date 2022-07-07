public class Main {
    public static void main(String[] args) {

        /* operators and operands */
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        /* abbreviating operators */
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result -= 1;
        System.out.println("3 - 1 = " + result);

        result *= 10;
        System.out.println("2 * 10 = " + result);

        result /= 5;
        System.out.println("20 / 5 = " + result);
    }
}