package com.coffeemetalcode;

public class Main {

    public static void main(String[] args) {

        /* byte - 8 bits */
        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + minByteVal);
        System.out.println("Byte Max Value = " + maxByteVal);

        /* short - 16 bits */
        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + minShortVal);
        System.out.println("Short Max Value = " + maxShortVal);

        /* integer - 32 bits */
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + minIntValue);
        System.out.println("Integer Max Value = " + maxIntValue);

        /* long - 64 bits */
        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + minLongVal);
        System.out.println("Long Max Value = " + maxLongVal);

        /* casting */
        int intTotal = (maxIntValue / 2);
        byte byteTotal = (byte) (minByteVal / 2);
        short shortTotal = (short) (maxShortVal / 2);
        long longTotal = (minLongVal / 2);

        /* challenge PrimitiveTypesChallenge */
        // create a valid byte variable
        byte challengeByte = -99;

        // create a valid short variable
        short challengeShort = 20001;

        // create a valid int variable
        int challengeInt = 2147483647;

        // create a long variable and make it equal to 50,000 plus 10 times the sum of the byte plus the short plus
        // the integer
        long challengeLong = 50000L + (10L * (challengeByte + challengeShort + challengeInt));

        System.out.println("challenge result = " + challengeLong);
    }
}
