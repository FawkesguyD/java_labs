package org.example.lab4_1.ex4_abstract;

public class FurnitureShop {
    public void sellFurniture(Furniture furniture) {
        System.out.println("Sold:");
        furniture.displayInfo();
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("chair comfort", 100.0, 4);
        Table table = new Table("dinner table", 200.0, 6);
        Sofa sofa = new Sofa("soft sofa", 500.0, true);

        shop.sellFurniture(chair);
        shop.sellFurniture(table);
        shop.sellFurniture(sofa);
    }
}
