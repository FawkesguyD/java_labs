package org.example.lab23;

public interface Queue<T> {
    public void enqueue(T item);
    public Object element();
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public void clear();

}
