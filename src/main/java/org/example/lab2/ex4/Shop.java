package org.example.lab2.ex4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Shop {
        private List<Computer> computers;

        public Shop() {
            computers = new ArrayList<>();
        }

        // Метод для добавления компьютера в магазин
        public void addComputer(Computer computer) {
            computers.add(computer);
        }

        // Метод для удаления компьютера из магазина
        public void removeComputer(Computer computer) {
            computers.remove(computer);
        }

        // Метод для поиска компьютера по модели
        public List<Computer> searchComputerByModel(String model) {
            List<Computer> result = new ArrayList<>();
            for (Computer computer : computers) {
                if (computer.getModel().equalsIgnoreCase(model)) {
                    result.add(computer);
                }
            }
            return result;
        }

        // Метод для вывода всех компьютеров в магазине
        public void displayAllComputers() {
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Shop shop = new Shop();

            while (true) {
                System.out.println("\nМеню:");
                System.out.println("1. Добавить компьютер");
                System.out.println("2. Удалить компьютер");
                System.out.println("3. Поиск компьютера по модели");
                System.out.println("4. Вывести все компьютеры в магазине");
                System.out.println("5. Выход");
                System.out.print("Выберите действие: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Чтобы считать символ новой строки

                switch (choice) {
                    case 1:
                        System.out.print("Введите модель компьютера: ");
                        String model = scanner.nextLine();
                        System.out.print("Введите цену компьютера: ");
                        double price = scanner.nextDouble();
                        Computer computer = new Computer(model, price);
                        shop.addComputer(computer);
                        System.out.println("Компьютер добавлен в магазин.");
                        break;
                    case 2:
                        System.out.print("Введите модель компьютера, который нужно удалить: ");
                        String modelToRemove = scanner.nextLine();
                        List<Computer> computersToRemove = shop.searchComputerByModel(modelToRemove);
                        if (computersToRemove.isEmpty()) {
                            System.out.println("Компьютер не найден.");
                        } else {
                            for (Computer comp : computersToRemove) {
                                shop.removeComputer(comp);
                                System.out.println("Компьютер удален из магазина: " + comp);
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Введите модель компьютера для поиска: ");
                        String searchModel = scanner.nextLine();
                        List<Computer> searchResult = shop.searchComputerByModel(searchModel);
                        if (searchResult.isEmpty()) {
                            System.out.println("Компьютеры с такой моделью не найдены.");
                        } else {
                            System.out.println("Найденные компьютеры:");
                            for (Computer comp : searchResult) {
                                System.out.println(comp);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Список всех компьютеров в магазине:");
                        shop.displayAllComputers();
                        break;
                    case 5:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Неверный выбор, попробуйте еще раз.");
                }
            }
        }
}
