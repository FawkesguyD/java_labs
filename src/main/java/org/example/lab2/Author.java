package org.example.lab2;

import java.util.Scanner;

public class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return super.toString();
    }

}
