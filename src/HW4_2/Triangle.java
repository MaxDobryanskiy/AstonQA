package HW4_2;

public class Triangle implements Shape {
    private double sideA, sideB, sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;

        if (!isValidTriangle()) {
            throw new IllegalArgumentException("Некорректные стороны треугольника");
        }

    }

    private boolean isValidTriangle() {
        return (sideA + sideB > sideC) &&
                (sideA + sideC > sideB) &&
                (sideB + sideC > sideA);
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
