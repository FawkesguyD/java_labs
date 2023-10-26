package org.example.lab21;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<>(1, 2, 3);

        array.displayArray();

        array.addElement(10);
        array.addElement(20);

        array.displayArray();

        MyArrayList<String> array2 = new MyArrayList<>("H", "G", "F");

        array2.displayArray();

        array2.addElement("A");
        array2.addElement("QWERTYUIO");

        array2.displayArray();

        int index = 2;
        System.out.println("Введем индекс : "  + index +
                           "\nЭлемент массива по индексу: " + array2.displayElement(index));
    }
}
