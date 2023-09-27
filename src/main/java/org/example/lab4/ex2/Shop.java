package org.example.lab4.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private String login;
    private String passwd;

    enum Category {
        PC,
        House,
        Outside;

        int amount = 3;
    }

    // для корзины
    ArrayList<Item> garbage = new ArrayList<>();
    // для всех товаров в магазине
    ArrayList<Item> goods = new ArrayList<>();

    void autorization() {
        Scanner in = new Scanner(System.in);
        System.out.print("login(everything): ");
        this.login = in.nextLine();
        System.out.print("password(just digits): ");
        this.passwd = in.nextLine();
    }

    void buying() {
        garbage.clear();
    }

    void AddItem(String name, Integer price, Category category) {
        goods.add(new Item(name, price, category));
    }

    void AddTogarbage(String name) {
        for (Item item: goods) {
            if (Objects.equals(item.getName(), name)) {
                garbage.add(item);
            }
        }
    }

    void ViewGarbage() {
        for (Item item: garbage) {
            System.out.println(item);
        }
    }
    void ViewByCategory(Category category) {
        for (Item item: goods) {
            if (Objects.equals(item.getCategory(), category)) {
                System.out.println(item);
            }
        }
    }
    void GetCategoies() {
        System.out.println(Arrays.toString(Category.values()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shop shop = new Shop();

        shop.AddItem("keyboard", 5000, Category.PC);
        shop.AddItem("mouse", 2500, Category.PC);
        shop.AddItem("couch", 15000, Category.House);
        shop.AddItem("grill", 6000, Category.Outside);
        shop.AddItem("monitor", 8000, Category.PC);
        shop.AddItem("desk", 6000, Category.PC);
        shop.AddItem("lamp", 2000, Category.House);
        shop.AddItem("tent", 3000, Category.Outside);
        shop.AddItem("headphones", 4000, Category.PC);
        shop.AddItem("chair", 5000, Category.PC);

        boolean flag = false;
        while(!flag) {
            System.out.println(
                    "Authorization     | 1\n" +
                    "Catalog           | 2\n" +
                    "Items             | 3\n" +
                    "AddToGarbage      | 4\n" +
                    "Buy               | 5\n");

            System.out.print("enter action: ");
            int action = in.nextInt();
            switch (action) {
                case 1: {
                    shop.autorization();
                    System.out.println();
                    break;
                }
                case 2: {
                    shop.GetCategoies();
                    System.out.println();
                    break;
                }
                case 3: {
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("enter name of category: ");
                    String userInput = scanner.nextLine();

                    try {
                        Category userCategory = Category.valueOf(userInput);
                        shop.ViewByCategory(userCategory);
                    } catch (IllegalArgumentException e) {
                        System.out.println("invalid category.");
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("enter name of product to add to the garbage: ");
                    String item = scanner.nextLine();

                    shop.AddTogarbage(item);
                    System.out.println("Garbage: ");
                    shop.ViewGarbage();

                    System.out.println();
                    break;
                }
                case 5: {
                    shop.buying();
                    System.out.println("Garbage: ");
                    shop.ViewGarbage();

                    System.out.println();
                    break;
                }
                default:
                    break;
            }
        }
    }
}
