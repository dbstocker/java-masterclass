package challenges;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        long result;
        if (kilometersPerHour < 0) {
            result = -1;
        } else {
            result = Math.round(kilometersPerHour / 1.609);
        }
        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        String printStatement;

        if (kilometersPerHour < 0) {
            printStatement = "Invalid Value";
        } else {
            printStatement = kilometersPerHour + " km/h = " + milesPerHour + " mi/h";
        }
        System.out.println(printStatement);
    }
}
