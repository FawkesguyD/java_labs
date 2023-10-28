package org.example.lab23.ex2;

public class TestLinkedQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();

        System.out.println("Size: " + queue.size());
        System.out.println("First element: " + queue.element());
        System.out.println("Return and delete first element: " + queue.dequeue());
        queue.display();
        queue.enqueue(4);
        queue.display();

        System.out.println("clear queue...");
        queue.clear();
        System.out.println("Size: " + queue.size());
        queue.display();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
    }
}
