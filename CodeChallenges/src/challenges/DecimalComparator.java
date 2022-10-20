package challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        // check out DecimalFormat
        // check out BigDecimal.setScale()
        boolean areEqual = false;
        BigDecimal firstFormat = new BigDecimal(first);
        BigDecimal secondFormat = new BigDecimal(second);

        System.out.println(firstFormat.setScale(3, RoundingMode.FLOOR));
        System.out.println(secondFormat.setScale(3, RoundingMode.FLOOR));
        System.out.println(firstFormat.equals(secondFormat));
        return firstFormat.equals(secondFormat);
    }
}
