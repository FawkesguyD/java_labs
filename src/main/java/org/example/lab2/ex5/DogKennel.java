package org.example.lab2.ex5;

import java.util.ArrayList;
import java.util.List;

public class DogKennel {
    private List<Dog> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void printDogs() {
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();

        Dog dog1 = new Dog("Рекс", 3);
        Dog dog2 = new Dog("Белла", 2);
        Dog dog3 = new Dog("Макс", 5);

        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        kennel.printDogs();

        // Пример использования метода calculateHumanAge
        System.out.println("Возраст Рекса в человеческих годах: " + dog1.calculateHumanAge());
    }
}
