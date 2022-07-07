public class Main {
    public static void main(String[] args) {

        /* char */
        char charVar = 'D';
        char unicodeChar = '\u0044';

        System.out.println("charVar = " + charVar);
        System.out.println("unicodeChar = " + unicodeChar);
        System.out.println("are they the same? " + (charVar == unicodeChar));

        /* boolean */

        boolean trueValue = true;
        boolean falseValue = false;

        System.out.println(trueValue);
        System.out.println(falseValue);
    }
}