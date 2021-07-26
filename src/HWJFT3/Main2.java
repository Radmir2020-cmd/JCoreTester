package HWJFT3;

/*
   В общем сначала все получалось, а потом как запутался...

Даны классы: Fruit, Apple extends Fruit, Orange extends Fruit.

--- Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

--- Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

--- Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
--- Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно,
в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
--- Не забываем про метод добавления фрукта в коробку.
 */
public class Main2 {
    public static void main(String[] args) {

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
            orangeBox1.add(new Orange());

            for (int i = 0; i < 4; i++) {
                orangeBox2.add(new Orange());
            }
            for (int i = 0; i < 6; i++) {
                appleBox.add(new Apple());
            }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        float orangeWeight1 = orangeBox1.getWeight();
        float orangeWeight2 = orangeBox2.getWeight();
        float appleWeight = appleBox.getWeight();

        System.out.println("Вес коробки 1 с апельсинами: " + orangeWeight1);
        System.out.println("Вес коробки 2 с апельсинами: " + orangeWeight2);
        System.out.println("Вес коробки с яблоками: " + appleWeight);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

}
