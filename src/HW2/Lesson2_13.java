package HW2;

public class Lesson2_13 {
    public static void main(String[] args) {
        int n = 5;
        int[][] squareArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            squareArray[i][n - 1 - i] = 1;
            squareArray[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
