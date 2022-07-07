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

        /* conditional logic */
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");
            System.out.println("This will print regardless of the value of isAlien"); // <- IDEA regards this
        // indentation as suspicious

        if (!isAlien)
            System.out.println("It also is not an alien!");

        if (!isAlien) {
            System.out.println("It also is not an alien!");
            System.out.println("Using code blocks - { } - is a better way of wrapping code in conditional logic in " +
                    "Java");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        /* logical and */
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) { // <- make code easier to read by enclosing discreet
            // expressions in their own parentheses
            System.out.println("Greater than secondTopScore and less than 100");
        }

        /* logical or */
        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("Greater than secondTopScore or less than 100");
            System.out.println("Either or both conditions are true");
        }

        /* assignment = vs is equal to == */
        int newVal = 50;
        if (newVal == 50) {
            System.out.println("This is an valid");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This should never happen");
        }

        /* ternary operator */
        boolean wasCar = isCar ? true : false;

        /* operator challenge (lesson 40) */
        // 1. create a double with value of 20.00
        double first = 20.00d;
        // 2. create a double with value of 80.00
        double second = 80.00d;
        // 3. add both numbers together and multiply by 100
        double third = (first + second) * 100;
        // 4. use remainder operator to determine remainder of result of step 3 and 40.00
        double fourth = third % 40.00d;
        // 5. create a boolean that assigns true if the remainder of step 4 is 0 and false if it is not 0
        boolean fifth = fourth == 0 ? true : false;
        // 6. output the boolean from step 5
        System.out.println("fifth = " + fifth);
        // 7. write an if-then that displays message "Got some remainder" if the boolean in step 5 is false
        if (!fifth) {
            System.out.println("Got some remainder");
        }

    }
}