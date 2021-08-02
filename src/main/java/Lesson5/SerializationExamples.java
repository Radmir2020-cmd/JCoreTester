package Lesson5;

import java.io.*;

public class SerializationExamples {
    public static void main(String[] args) {
        File file = new File("student");
        Student student = new Student("Anton", "Ivanov", 15);
        Student student1 = new Student("Alexey", "Petrov", 40);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
            objectOutputStream.writeObject(student);
            objectOutputStream.writeObject(student1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Student studentFromFile = (Student) objectInputStream.readObject();
            System.out.println(studentFromFile);
            Student studentFromFile1 = (Student) objectInputStream.readObject();
            System.out.println(studentFromFile1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
