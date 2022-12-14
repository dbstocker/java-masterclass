package challenges;

public class DigitSum {
    public static int sumDigits(int num) {
        if (num < 10) {
            return -1;
        }

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;

            num /= 10;
        }

        return sum;
    }
}
