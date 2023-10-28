package org.example.lab23.ex2;

import javax.xml.stream.events.NotationDeclaration;

public class CustomLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void displayList() {
        if (head == null) {
            System.out.println("empty");
        } else {
            Node<T> current = head;
            while (current != null) {
                if (current.next == null) {
                    System.out.println(current.data);
                } else {
                    System.out.print(current.data + " <- ");
                }
                current = current.next;
            }
        }
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index must be > 0.");
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("index out of bounds.");
        }

        current.next = current.next.next;
        size--;
    }

    public T pop() {
        return head.data;
    }
    public static void main(String[] args) {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.displayList();

        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.getSize());

        int size = linkedList.getSize();
        for (int i = 0; i < size; i++) {
            linkedList.remove(0);
        }
        linkedList.displayList();

        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.getSize());
    }
}
