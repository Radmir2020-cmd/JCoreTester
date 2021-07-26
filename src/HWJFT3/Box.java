package HWJFT3;

import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    public List<T> getList(){
        return list;
    }

    private final List<T> list;

    @SafeVarargs
    public Box(T... obj) {
        list = Arrays.asList(obj);
    }


    void add (T obj) {
        list.add(obj);
    }

    void moveAt(Box<T> box) {
//        for (T obj : list) {
//            box.add(obj);
//        }
        box.getList().addAll(list);
        list.clear();
    }

    void info() { // информационный метод который проверяет, коробка пуста или в ней что то есть
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " + list.size());
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}
