package challenges;

import java.util.Scanner;

public class MinimumAndMaximum {
    public static void userInputs() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int min = 0;
        int max = 0;

        while (counter < 5) {
            System.out.println("Enter a number");
            boolean isInt = scanner.hasNextInt();

            if (!isInt) {
                break;
            } else {
                int input = scanner.nextInt();
                if (counter == 0) {
                    min = input;
                    max = input;
                } else {
                    min = Math.min(input, min);
                    max = Math.max(input, max);
                }
                counter++;
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Smallest number was " + min);
        System.out.println("Largest number was " + max);
    }
}
