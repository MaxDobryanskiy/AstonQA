package HW4_2;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new Circle(5, "Red", "Black"),
                new Rectangle(4, 6, "Blue", "Green"),
                new Triangle(3, 4, 5, "Yellow", "Brown")
        };

        for (Shape shape : shapes) {
            System.out.println("Фигура: " + shape.getClass().getSimpleName());
            System.out.printf("Периметр: %.2f\n", shape.getPerimeter());
            System.out.printf("Площадь: %.2f\n", shape.getArea());
            System.out.println("Цвет заливки: " + shape.getFillColor());
            System.out.println("Цвет границы: " + shape.getBorderColor());
            System.out.println("------------------------------");
        }
    }
}
