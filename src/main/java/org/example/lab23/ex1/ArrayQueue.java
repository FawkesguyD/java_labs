package org.example.lab23.ex1;


import org.example.lab23.Queue;

public class ArrayQueue<T> implements Queue<T> {
    private static final int amount = 100;
    private static Object[] queue;
    private int size = 0;

    public ArrayQueue() {
        queue = new Object[amount];
    }

    @Override
    public void enqueue(Object item) {
        queue[size] = item;
        size++;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return queue[0];
    }

    @Override
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        queue = new Object[amount];
        size = 0;
    }
}
