package HW2;

public class Lesson2_3 {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0)
            System.out.println("Красный.");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый.");
        else if (value > 100)
            System.out.println("Зеленый.");
    }
}