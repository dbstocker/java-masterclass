package challenges;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void addTenEntries() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (counter < 11) {
            System.out.println("Enter number #" + counter + ":");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int input = scanner.nextInt();
                sum += input;
                counter++;
            } else {
                System.out.println("Invalid input.");
                sum = -1;
            }

            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum is " + sum);
    }
}
