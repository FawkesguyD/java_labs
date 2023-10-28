package org.example.lab23.ex2;

import org.example.lab23.Queue;

public class LinkedQueue<T> implements Queue<T> {
    private final CustomLinkedList<T> linkedList = new CustomLinkedList<>();

    @Override
    //Добавить элемент в конец очеред
    public void enqueue(T item) {
        linkedList.add(item);
    }

    @Override
    //Получить первый элемент в очереди.
    public Object element() {
        return linkedList.pop();
    }

    @Override
    //Удалить и вернуть первый элемент в очереди.
    public Object dequeue() {
        Object buff = linkedList.pop();
        linkedList.remove(0);
        return buff;
    }

    @Override
    //Получить текущий размер очереди.
    public int size() {
        return linkedList.getSize();
    }

    @Override
    //Проверить, является ли очередь пустой.
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    //Удалить все элементы из очереди
    public void clear() {
        int size = linkedList.getSize();
        for (int i = 0; i <size; i++) {
            linkedList.remove(0);
        }
    }

    public void display() {
        System.out.print("Queue: ");
        linkedList.displayList();
    }
}
