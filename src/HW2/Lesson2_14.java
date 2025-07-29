package HW2;

public class Lesson2_14 {
    public static void main(String[] args) {
        int[] array = createArray(5, 42);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}
