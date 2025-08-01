package HW4_2;

public interface Shape {

    default double getPerimeter() {
        return 0;
    }

    default double getArea() {
        return 0;
    }
    String getFillColor();
    String getBorderColor();
}

