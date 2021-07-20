package HWJFT2;

public class Main { //создаем класс мэйн
    public static void main(String[] args) {
        String[][] arr = new String[][]{ // задаем двумерный массив
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "1", "2", "3"},
                {"4", "5", "6", "7"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException { // создаем метод
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) { // запускаем цикл  по i
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) { // запускаем цикл по j
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
