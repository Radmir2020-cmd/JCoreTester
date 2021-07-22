package Lesson3;

import java.util.Arrays;

public class NumbersBox<T extends Number>{
    private T[] array;

    public NumbersBox(T... array) {
        this.array = array;
    }

    public double calcAverage() {
        double sum = 0.0;
        for (T num: array){
            sum = sum + num.doubleValue();
        }
        return sum / array.length;
    }

    public T[] getArray() {
        return array;
    }

//    public boolean isSameAvg(NumbersBox<T> boxToCompare) {
//        return calcAverage() == boxToCompare.calcAverage();
//    }

    public boolean isSameAvg(NumbersBox<?> boxToCompare) {
        return Math.abs(calcAverage() - boxToCompare.calcAverage()) < 0.0001;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public static <U extends Number> U getFirstElement(NumbersBox<U> numbersBox) {
        return numbersBox.getArray()[0];
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        NumbersBox<Integer> integerNumbersBox1 = new NumbersBox<>(1,2,2,2,2,2,5);
        System.out.println(integerNumbersBox1.calcAverage());

        NumbersBox<Integer> integerNumbersBox2 = new NumbersBox<>(1,34,67,45,87);

        NumbersBox<Double> doubleNumbersBox1 = new NumbersBox<>(1.0, 4.7, 80.6, 3.7);

        System.out.println(integerNumbersBox2.isSameAvg(doubleNumbersBox1));

        System.out.println(getFirstElement(doubleNumbersBox1));
    }
}
