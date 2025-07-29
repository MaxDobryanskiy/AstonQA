package HW2;

public class Lesson2_9 {
    public static void main(String[] args) {
        System.out.println(chekYear(1900));

    }

    public static boolean chekYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}