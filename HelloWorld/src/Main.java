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

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("'double' values can be between " + minDouble + " and " + maxDouble + ".");

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("'float' values can be between " + minFloat + " and " + maxFloat + ".");
    }
}
