package challenges;

public class AreaCalculator {
    private static final double INVALID_VALUE = -1.0d;

    public static double area(double radius) {
        double area = INVALID_VALUE;
        if (radius >= 0) {
            area = (radius * radius) * Math.PI;
        }
        System.out.println(area);
        return area;
    }

    public static double area(double x, double y) {
        double area = INVALID_VALUE;
        if (x >= 0 && y >= 0) {
            area = x * y;
        }
        System.out.println(area);
        return area;
    }
}
