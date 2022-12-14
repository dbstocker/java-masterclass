package challenges;

import java.util.List;

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


}
