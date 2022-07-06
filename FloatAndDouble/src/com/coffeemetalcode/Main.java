package com.coffeemetalcode;

public class Main {

    public static void main(String[] args) {
	    /* float */
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        System.out.println("Min float value = " + minFloatValue);
        System.out.println("Max float value = " + maxFloatValue);

        /* double */
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("Min double value = " + minDoubleValue);
        System.out.println("Max double value = " + maxDoubleValue);

        int newInt = 5 / 3;
        float newFloat1 = 5f / 3f;
        float newFloat2 = (float) 5 / 3; // <- not recommended
        double newDouble = 5d / 3d;

        /* NOTE: double is the preferred data type for decimal numbers */

        System.out.println("newInt val = " + newInt);
        System.out.println("newFloat1 val = " + newFloat1);
        System.out.println("newFloat2 val = " + newFloat2);
        System.out.println("newDouble val = " + newDouble);

        /* Challenge: convert pounds to kilograms */
        // variable to store pounds
        double pounds = 10d;

        // calculate result and store in variable for kilograms
        // hint: 1 pound = 0.45359237 kilograms
        double kilograms = pounds * 0.45359237d;

        // print result
        System.out.println(pounds + "lbs is equal to " + kilograms + " kg");
    }
}
