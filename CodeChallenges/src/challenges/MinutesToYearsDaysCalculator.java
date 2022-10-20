package challenges;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        String printStatement = "Invalid Value";
        if (minutes >= 0) {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;

            printStatement = minutes + " min = " + years + " y and " + remainingDays + " d";
        }

        System.out.println(printStatement);
    }
}
