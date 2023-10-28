package org.example.lab23.ex1;

import org.example.lab23.ex1.ArrayQueueModule;

public class TestModule {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> queue = new ArrayQueueModule<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        displayQueue(queue);

        System.out.println("Size: " + queue.size());
        System.out.println("First element: " + queue.element());
        System.out.println("Return and delete first element: " + queue.dequeue());
        displayQueue(queue);

        System.out.println("clear queue...");
        queue.clear();
        System.out.println("Size: " + queue.size());
        displayQueue(queue);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        displayQueue(queue);
    }

    public static void displayQueue(ArrayQueueModule<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i < queue.size(); i++) {
                Object element = queue.dequeue();
                System.out.print(element + " ");
                queue.enqueue(element);
            }
            System.out.println();
        }
    }
}
