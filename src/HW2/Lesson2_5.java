package HW2;

public class Lesson2_5 {
    public static void main(String[] args) {
        System.out.println(isSumInRange(5, 7));
    }

    public static boolean isSumInRange(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}
