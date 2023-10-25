package org.example.lab19.ex2;

import java.util.Objects;
import java.util.Scanner;

public class main {
    public static Student[] students = {
            new Student("Smith", "John", "William", 85),
            new Student("Johnson", "Alice", "Marie", 78),
            new Student("Brown", "Robert", "Joseph", 92),
            new Student("Davis", "Emily", "Grace", 70),
            new Student("Wilson", "Michael", "David", 89)
    };
    public static void main(String[] args) throws StudentException {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter surname to find a Student: ");
        String surname = in.nextLine();

        try {
            Student student = findStudent(surname);
            System.out.println(student);
        } catch (StudentException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public static Student findStudent(String surname) throws StudentException {
        for (Student item: students) {
            if (item.getSurname().equals(surname)) {
                return item;
            }
        }
        throw new StudentException("No such Student");
    }
}
