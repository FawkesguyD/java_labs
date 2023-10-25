package org.example.lab19.ex1;

public class User {
    private String name;
    private int INN;

    public User(String name, int INN) {
        this.name = name;
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public int getINN() {
        return INN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setINN(int INN) {
        this.INN = INN;
    }
}
