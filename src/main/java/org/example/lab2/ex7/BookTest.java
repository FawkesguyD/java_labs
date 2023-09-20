package org.example.lab2.ex7;

public class BookTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(5);

        // Добавление книг на полку
        bookshelf.addBook(new Book("Лев Толстой", "Война и мир", 1869));
        bookshelf.addBook(new Book("Фёдор Достоевский", "Преступление и наказание", 1866));
        bookshelf.addBook(new Book("Михаил Булгаков", "Мастер и Маргарита", 1967));

        // Поиск книги с самым поздним годом издания
        Book latestBook = bookshelf.findLatestBook();
        if (latestBook != null) {
            System.out.println("Самая поздняя книга:");
            System.out.println(latestBook);
        } else {
            System.out.println("Книжная полка пуста.");
        }

        // Поиск книги с самым ранним годом издания
        Book earliestBook = bookshelf.findEarliestBook();
        if (earliestBook != null) {
            System.out.println("Самая ранняя книга:");
            System.out.println(earliestBook);
        } else {
            System.out.println("Книжная полка пуста.");
        }

        // Сортировка книг по году издания
        bookshelf.sortBooksByYear();

        // Отображение содержимого полки
        System.out.println("Книги на полке после сортировки:");
        bookshelf.displayBooks();
    }
}
