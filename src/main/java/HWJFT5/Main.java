package HWJFT5;

/*
Реализовать сохранение данных в csv файл;
Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура файла:
Строка заголовок с набором столбцов
Набор строк с целочисленными значениями
Разделитель между столбцами - символ точка с запятой (;)
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        AppData appData = new AppData();
        appData.load("HWJFT5.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("HWJFT5-1.txt");

    }
}
