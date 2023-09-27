package org.example.lab5.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match implements ActionListener {
    private JPanel panel;
    private JFrame frame;
    private JButton Milan;
    private JButton Real;
    private JLabel result;
    private JLabel last;
    private JLabel winner;
    int scoreOfMilan = 0;
    int scoreOfReal = 0;
    public Match() {

        //начальная настройка
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Match");
        frame.setLayout(new GridLayout(2,3));

        //инициализация элементов
        Milan = new JButton("AC Milan");
        Real = new JButton("Real Madrid");
        result = new JLabel("0 X 0");
        last = new JLabel("Last Scorer: N/A");
        winner = new JLabel("Winner DRAW");
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        //добавление элементов на фрейм
        frame.add(Milan);
        frame.add(Real);
        frame.add(panel);
        panel.add(result);
        panel.add(last);
        panel.add(winner);

        //действия при нажатии на кнопку
        Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreOfMilan++;
                result.setText(scoreOfMilan +" X " + scoreOfReal);
                last.setText("Last Scorer: AC Milan");
                setWinner();
            }
        });

        Real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreOfReal++;
                result.setText(scoreOfMilan +" X " + scoreOfReal);
                last.setText("Last Scorer: Real Madrid");
                setWinner();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Match();
            }
        });
    }


    public void actionPerformed(ActionEvent e) {
    }
    public void setWinner() {
        if (scoreOfMilan > scoreOfReal) {
            winner.setText("Winner: AC Milan");
        } else if (scoreOfReal == scoreOfMilan) {
            winner.setText("Winner: DRAW");
        } else {
            winner.setText("Winner: Real Madrid");
        }
    }
}
