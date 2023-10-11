package org.example.lab9.ex2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Daniel"));
        students.add(new Student(2, "Charlie"));
        students.add(new Student(4, "David"));
        students.add(new Student(1, "John"));
        students.add(new Student(5, "Alice"));

        System.out.print("Unsorted array: ");
        printArray(students);

        students.sort(new SortingStudentsByGPA());

        System.out.print("\nSorted array: ");
        printArray(students);
    }

    public static void printArray(List<Student> arr) {
        for (Student student: arr) {
            System.out.println(student);
        }
    }
}
