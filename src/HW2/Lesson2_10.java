package HW2;

public class Lesson2_10 {
    public static void main(String[] args) {

        int[] numbers = {1, 0, 0, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else numbers[i] = 0;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}