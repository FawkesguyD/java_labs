package org.example.lab4.ex2;

public class Item {
    private String name;
    private Integer price;
    private Shop.Category category;

    Item(String name, Integer price, Shop.Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Shop.Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return  name +
                ", price(" + price + "rub)";
    }
}
