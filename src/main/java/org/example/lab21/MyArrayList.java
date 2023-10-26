package org.example.lab21;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array;

    public MyArrayList() {
        array = (T[]) new Object[0];
    }

    @SafeVarargs
    public MyArrayList(T... items) {
        array = items;
    }

    public void displayArray() {
        for (T item: array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void addElement(T item) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = (T) item;
        array = newArray;
    }

    public T displayElement(int Inddex) {
        return array[Inddex];
    }
}
