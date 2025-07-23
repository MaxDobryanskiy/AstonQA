package HW2;

public class Lesson_1_13 {
    public static void main(String[] args) {
        int n = 5;
        int[][] squareArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            squareArray[i][n - 1 - i] = 1;
            squareArray[i][i] = 1;
        }
        System.out.println(squareArray[0][24]);
    }
}
