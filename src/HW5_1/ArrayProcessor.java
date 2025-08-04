package HW5_1;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArrayProcessor {

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Некорректный размер массива: ожидается 4x4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Некорректный размер строки " + i + ": ожидается 4 элемента");
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "six", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "!@#"}
        };

        String[][] outOfBoundsArray = new String[4][4];
        try {
            outOfBoundsArray[0][0] = "1";
            outOfBoundsArray[0][1] = "2";
            outOfBoundsArray[0][2] = "3";
            outOfBoundsArray[0][3] = "4";

            outOfBoundsArray[1][0] = "5";
            outOfBoundsArray[1][1] = "6";
            outOfBoundsArray[1][2] = null;

            outOfBoundsArray[4][0] = "17";

            int result = processArray(outOfBoundsArray);
            System.out.println("Сумма элементов: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обнаружена ошибка ArrayIndexOutOfBounds: попытка обращения за пределы массива");
        }

        try {
            int result = processArray(correctArray);
            System.out.println("Сумма элементов корректного массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}