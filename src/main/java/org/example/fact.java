package org.example;

public class fact {
    void factorial() {
        int number = 1;
        for (int i = 1; i <= 10; i++) {
            number *= i;
            System.out.println(number + '\n');
        }
    }
}
