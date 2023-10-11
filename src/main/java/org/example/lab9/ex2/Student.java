package org.example.lab9.ex2;

public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(double gpa, String name) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Сравниваем студентов по убыванию GPA
        return Double.compare(otherStudent.getGpa(), this.getGpa());
    }
}
