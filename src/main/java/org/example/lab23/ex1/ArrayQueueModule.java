package org.example.lab23.ex1;

// Реализация очереди с использованием переменных класса.
public class ArrayQueueModule<T> {

    private static final int amount = 100;
    private Object[] queue = new Object[amount];
    private int size = 0;


    public void enqueue(Object item) {
        queue[size] = item;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return queue[0];
    }

    public Object dequeue() {
        if (!(isEmpty())) {
            Object buff = queue[0];
            for (int i = 0; i < size; i++) {
                queue[i] = queue[i+1];
            }
            size--;
            return buff;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        queue = new Object[amount];
        size = 0;
    }

}
