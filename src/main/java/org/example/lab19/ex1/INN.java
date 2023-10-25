package org.example.lab19.ex1;

import java.util.Objects;
import java.util.Scanner;

public class INN {
    public static User[] arr = {
            new User("Jane Smith", 1000000),
            new User("James Brown", 777777),
            new User("John Doe", 123456)
    };
    public static void main(String[] args) throws INNException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your INN:");
        int INN = in.nextInt();

        boolean flag = false;
        for (User item: arr) {
            if (INN == item.getINN() && Objects.equals(name, item.getName())) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Name: " + name + "\nINN: " + INN);
        } else {
            throw new INNException("No such INN");
        }
    }
}
