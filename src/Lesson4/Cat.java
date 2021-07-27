package Lesson4.garage;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("test", 1);
        Cat cat2 = new Cat("test", 1);
        Cat cat3 = new Cat("test2", 1);

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
    }
}
