package challenges;

import java.util.List;
import java.util.Scanner;

public class Scratch {
    public static void interestLoop () {
        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000, (double) i)));
        }
    }

    public static void interestReverseLoop () {
        for (int i = 8; i > 1; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000, (double) i)));
        }
    }

    public static void findPrimes() {
        int primes = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primes++;
            }
            if (primes == 10) {
                break;
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }

    /* Sum 3 and 5 */
    public static void sumThreeAndFive() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println(i);
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("*******");
        System.out.println("Sum = " + sum);
    }

    /* isEvenNumber */
    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    /* Find Even Numbers */
    public static void findEvens() {
        int currentNum = 4;
        int evenCount = 0;

        while (evenCount < 5) {
            currentNum++;
            if(!isEvenNumber(currentNum)) {
                continue;
            }
            evenCount++;
            System.out.println("Even number " + currentNum);

        }
        System.out.println("Total evens: " + evenCount);
    }

    /* Parsing String Values */
    public static void stringParse() {
        String numStr = "2022";
        System.out.println("numStr = " + numStr);

        int num = Integer.parseInt(numStr);
        System.out.println("num = " + num);
        numStr += 1; // converts int 1 to a string "1" and appends to numStr
        num += 1; // adds int 1 to parsed int value of num from previous operation

        System.out.println("\nnumStr = " + numStr);
        System.out.println("***************");
        System.out.println("num = " + num);
    }

    /* Reading User Input */

    public static void nameAndAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yob = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2022 - yob;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }
}
