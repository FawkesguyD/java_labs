package org.example.lab22;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class V_App {
    JFrame frame = new JFrame("Калькулятор");
    JLabel screen = new JLabel("0");
    JPanel buttons = new JPanel();
    JLabel emptyLabel = new JLabel();

    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonDiv = new JButton("/");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton buttonMul = new JButton("*");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton buttonSub = new JButton("-");
    JButton button0 = new JButton("0");
    JButton buttonPoint = new JButton(".");
    JButton buttonPlus = new JButton("+");
    JButton buttonResult = new JButton("=");
    JButton buttonAC = new JButton("AC");
    Color buttonColor = Color.DARK_GRAY;
    Color textColor = Color.WHITE;
    Font ButtonsFont = new Font("Trebuchet MS", Font.PLAIN, 24);
    Font ScreenFont = new Font("Trebuchet MS", Font.PLAIN, 36);

    public V_App() {
        // Окно приложения
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.BLACK);

        // Экран для вывода результатов
        screen.setPreferredSize(new Dimension(400, 100));
        screen.setHorizontalAlignment(SwingConstants.RIGHT);
        screen.setFont(ScreenFont);
        screen.setForeground(textColor);

        // Добавление отступа справа
        screen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));

        frame.add(screen, BorderLayout.NORTH);

        // Кнопки
        buttons.setBackground(Color.BLACK);
        buttons.setLayout(new GridLayout(5, 4, 10, 10));

        //настройки пустой ячейки
        emptyLabel.setOpaque(true); //фон ячейки непрозрачным
        emptyLabel.setBackground(Color.BLACK); //цвет фона


        Component[] allButtons = {
                button7, button8, button9, buttonDiv,
                button4, button5, button6, buttonMul,
                button1, button2, button3, buttonSub,
                button0, buttonPoint, buttonPlus, buttonResult,
                buttonAC
        };

        for (Component button : allButtons) {
            button.setBackground(buttonColor);
            button.setForeground(textColor);
            button.setFont(ButtonsFont);
            button.setFocusable(false);
            buttons.add(button);
        }

        buttons.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frame.add(buttons, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { new V_App(); }
        });
    }
}
