package HWJFT4;
/*
2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний
 функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
 Консоль использовать только для вывода результатов проверки телефонного справочника.
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Справочник"); // Создаем справочник
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------------");

        phonebook.add("Алексеев", "8-999-234-45-65"); // Заполняем справочник
        phonebook.add("Алексеев", "8-888-123-33-99");
        phonebook.add("Петров", "8-777-987-78-65");
        phonebook.add("Сидоров", "8-999-345-56-18");
        phonebook.add("Рожнов", "8-444-278-89-00");

        System.out.println("Алексеев"); // получить записи из списка
        System.out.println(phonebook.get("Алексеев"));

        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));

        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));

        System.out.println("Рожнов");
        System.out.println(phonebook.get("Рожнов"));
        System.out.println("-----------------");

        System.out.println("Лолвцов");
        System.out.println(phonebook.get("Лолвцов")); // если нет в справочнике
        System.out.println("-----------------");

        phonebook.add("Петров", "8-777-987-78-65"); // операция с существующим номером
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));

    }

}
