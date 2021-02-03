package Lesson2;

public class Main {
    static String arr[][] = {{"1", "2", "3", "4"},
            {"1", "1", "n", "1"},
            {"1", "1", "2", "1"},
            {"1", "1", "1", "1"}};

    public static void main(String[] args) {

        try {
            getArray(arr);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива");
        } catch (MyArrayDataException e1) {
            System.out.printf("Ошибка данных, значение не числовое в строке %d, ряд %d%n", (e1.range + 1), (e1.row + 1));
        }
    }

    public static void getArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

    }
}
