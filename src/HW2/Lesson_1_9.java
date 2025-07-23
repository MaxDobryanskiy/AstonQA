package HW2;

public class Lesson_1_9 {
    public static void main(String[] args) {
        System.out.println(chekYear(2016));

    }

    public static boolean chekYear(int year) {

        if (year % 400 == 0)
            return true;
        if (year % 4 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        else return false;
    }
}




