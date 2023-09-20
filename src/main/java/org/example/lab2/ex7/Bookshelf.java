package org.example.lab2.ex7;

import java.util.Arrays;

public class Bookshelf {
    private Book[] books;
    private int numberOfBooks;

    public Bookshelf(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    // Метод для добавления книги на полку
    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Книжная полка заполнена. Нельзя добавить больше книг.");
        }
    }

    // Метод для поиска книги с самым поздним годом издания
    public Book findLatestBook() {
        if (numberOfBooks == 0) {
            return null;
        }

        Book latestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }

        return latestBook;
    }

    // Метод для поиска книги с самым ранним годом издания
    public Book findEarliestBook() {
        if (numberOfBooks == 0) {
            return null;
        }

        Book earliestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }

        return earliestBook;
    }

    // Метод для сортировки книг на полке по году издания
    public void sortBooksByYear() {
        Arrays.sort(books, 0, numberOfBooks, (book1, book2) -> Integer.compare(book1.getYear(), book2.getYear()));
    }

    // Метод для отображения содержимого полки
    public void displayBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }
}
