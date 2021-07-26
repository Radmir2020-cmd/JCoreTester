package HWJFT3;


/*
Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Integer[] arr = {4, 9, 23, -65}; //задаем числовой массив
        String[] arr = {"qwerty", "asd", "dim", "567"}; // хадаем строчный массив

        System.out.println(Arrays.toString(arr));
        changeElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static <T> void changeElements(T[] array, int index1, int index2){ // создаем метод по смене
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
