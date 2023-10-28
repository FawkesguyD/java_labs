package org.example.lab23.ex1;

import org.example.lab23.ex1.ArrayQueueADT;

public class TestADT {
    public static void main(String[] args) {
        ArrayQueueADT<Integer> queue = new ArrayQueueADT<>();

        queue.enqueue(queue,1);
        queue.enqueue(queue,2);
        queue.enqueue(queue,3);
        displayQueue(queue);

        System.out.println("Size: " + queue.size(queue));
        System.out.println("First element: " + queue.element(queue));
        System.out.println("Return and delete first element: " + queue.dequeue(queue));
        displayQueue(queue);

        System.out.println("clear queue...");
        queue.clear(queue);
        System.out.println("Size: " + queue.size(queue));
        displayQueue(queue);

        queue.enqueue(queue,10);
        queue.enqueue(queue,20);
        queue.enqueue(queue,30);
        displayQueue(queue);
    }

    public static void displayQueue(ArrayQueueADT<Integer> queue) {
        if (queue.isEmpty(queue)) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i < queue.size(queue); i++) {
                Object element = queue.dequeue(queue);
                System.out.print(element + " ");
                queue.enqueue(queue, element);
            }
            System.out.println();
        }
    }
}
