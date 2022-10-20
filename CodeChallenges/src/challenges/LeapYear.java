package challenges;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean rangeCheck = (year > 1 && year < 10000);
        boolean leap = true;

        if (year % 4 != 0) {
            leap = false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            leap = false;
        }

        return rangeCheck && leap;
    }
}
