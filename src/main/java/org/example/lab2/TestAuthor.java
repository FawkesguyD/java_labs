package org.example.lab2;

public class TestAuthor extends Author{

    TestAuthor(String name, String email, char gender) {
        super(name, email, gender);
    }
    public void test() {
        TestAuthor person = new TestAuthor("Daniel", "sdljfkhs@gmail.com", 'm');


        System.out.println("Email: " + person.getEmail());
        System.out.println("Name: " + person.getName());
        System.out.println("gender: " + person.getGender());

        person.setEmail("qwerty@gmail.com");
        System.out.println("email: " + person.getEmail());
    }
}
