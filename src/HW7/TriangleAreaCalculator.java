package HW7;


public class TriangleAreaCalculator {
    public static double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) throw new IllegalArgumentException("Значения должны быть положительными.");
        return (base * height) / 2;
    }
}