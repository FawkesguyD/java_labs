package org.example.lab4_1.ex3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {
        this.age = 0;
        this.fullName = "unknown";
    }

    public void move() {
        System.out.println(fullName + " moving");
    }
    public void talk() {
        System.out.println(fullName + " talking");
    }

    public static void main(String[] args) {
        Person John = new Person("John D", 90);
        Person Masha = new Person();

        John.move();
        John.talk();

        System.out.println();
        Masha.move();
        Masha.talk();
    }
}
