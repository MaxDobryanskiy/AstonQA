package HW2;


public class Lesson2_8 {
    public static void main(String[] args) {
        printStringMultipleTimes("Привет!", 3);
    }

    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}