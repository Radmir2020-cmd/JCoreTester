package HWJFT4;
/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
*/

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Поезд", "Машина", "Велосипед", "Самокат", "Мопед",
                "Ролики", "Самолет", "Корабль", "Самокат", "Мопед",
                "Машина", "Велосипед", "Самокат", "Самолет", "Самолет",
                "Велосипед", "Самокат", "Самолет", "Поезд", "Машина");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());

        System.out.println("Уникальные слова");
        System.out.println(unique.toString());

        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
