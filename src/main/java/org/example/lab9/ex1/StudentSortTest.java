package org.example.lab9.ex1;

public class StudentSortTest{
    public static void main(String[] args) {
        Student[] student = new Student[] {
                new Student(3, "Daniel"),
                new Student(2, "Charlie"),
                new Student(4, "David"),
                new Student(1, "John")
        };
        System.out.println("Unsorted Students:");
        printStudents(student);

        // Sorting students using insertion sort
        insertionSort(student);

        System.out.println("\nSorted Students by ID Number:");
        printStudents(student);
    }

    public static void insertionSort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Comparable key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printStudents(Student[] arr) {
        for (Student student: arr) {
            System.out.println(student);
        }
    }
}
