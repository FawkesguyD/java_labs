package org.example.lab2.ex1;

public class TestAuthor{
    public static void main(String[] args) {
        Author person = new Author("Daniel", "sdljfkhs@gmail.com", 'm');

        System.out.println("Email: " + person.getEmail());
        System.out.println("Name: " + person.getName());
        System.out.println("gender: " + person.getGender());

        person.setEmail("qwerty@gmail.com");
        System.out.println("email: " + person.getEmail());

        System.out.println(person);
    }
}
