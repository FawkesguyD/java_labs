package org.example.lab2.ex9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();
        scanner.close();

        if (numPlayers <= 0) {
            System.out.println("Некорректное количество игроков.");
            return;
        }

        List<String> deck = generateDeck();
        shuffleDeck(deck);

        int cardsPerPlayer = 5;

        for (int player = 1; player <= numPlayers; player++) {
            System.out.println("Игрок " + player + ":");
            for (int i = 0; i < cardsPerPlayer; i++) {
                String card = deck.remove(0);
                System.out.println(card);
            }
            System.out.println();
        }
    }

    private static List<String> generateDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Черви", "Бубны", "Крести"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }
}
