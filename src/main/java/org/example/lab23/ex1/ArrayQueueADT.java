package org.example.lab23.ex1;

//Реализация очереди в виде абстрактного типа данных с явной передачей ссылки на экземпляр очереди.
public class ArrayQueueADT<T>{
    private static final int amount = 100;
    private Object[] queue = new Object[amount];
    private int size = 0;

    public void enqueue(ArrayQueueADT<T> adt, Object item) {
        adt.queue[size] = item;
        adt.size++;
    }

    public Object element(ArrayQueueADT<T> adt) {
        if (isEmpty(adt)) {
            return null;
        }
        return adt.queue[0];
    }

    public Object dequeue(ArrayQueueADT<T> adt) {
        if (!(isEmpty(adt))) {
            Object buff = adt.queue[0];
            for (int i = 0; i < adt.size; i++) {
                adt.queue[i] = adt.queue[i+1];
            }
            adt.size--;
            return buff;
        }
        return null;
    }

    public int size(ArrayQueueADT<T> adt) {
        return adt.size;
    }

    public boolean isEmpty(ArrayQueueADT<T> adt) {
        return adt.size == 0;
    }

    public void clear(ArrayQueueADT<T> adt) {
        adt.queue = new Object[amount];
        adt.size = 0;
    }
}
