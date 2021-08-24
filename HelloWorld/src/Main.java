public class Main {

    public static void main(String[] args) {
        System.out.println("Hello David!");

        int myFirstNumber = 5;

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("'byte' values can be between " + minByte + " and " + maxByte + ".");

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("'short' values can be between " + minShort + " and " + maxShort + ".");

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("'int' values can be between " + minInt + " and " + maxInt + ".");

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("'long' values can be between " + minLong + " and " + maxLong + ".");

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("'float' values can be between " + minFloat + " and " + maxFloat + ".");

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("'double' values can be between " + minDouble + " and " + maxDouble + ".");

        int newInt = 537;

        // cast
        float newTotal = (float) (newInt / 2);
        System.out.println("newTotal value: " + newTotal);

        // challenge
        byte cByte = 121;
        short cShort = 1057;
        int cInt = 40000;

        long cResult = (50000L + (10L * (cByte + cShort + cInt)));

        System.out.println("challenge total: " + cResult);

        // Floats and Doubles
        int intVal = 5 / 3;
        float floatVal = 5f / 3f;
        double doubleVal = 5d / 3d;

        System.out.println("intVal " + intVal);
        System.out.println("floatVal " + floatVal);
        System.out.println("doubleVal " + doubleVal);

        System.out.println(poundsToKilos(180d));
    }
    public static String poundsToKilos(double pounds) {
        return pounds + " pounds is " + pounds * 0.45359237d + " kilograms.";
    }
}
