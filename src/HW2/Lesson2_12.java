package HW2;

public class Lesson2_12 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6)
                numbers[i] = numbers[i] * 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}