package challenges;

public class DaysInMonth {
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

    public static int getDaysInMonth(int month, int year) {
        int days;
        boolean rangeCheckMonth = (month > 0 && month < 13);
        boolean rangeCheckYear = (year > 1 && year < 10000);

        int feb = isLeapYear(year) ? 29 : 28;

        if (!rangeCheckMonth || !rangeCheckYear) {
            days = -1;
        } else {
            switch (month) {
                case 2:
                    days = feb;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }
        }
        return days;
    }
}
