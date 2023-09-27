package org.example.lab5.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public void SimpleSwingApp() {
        JFrame frame = new JFrame("My app");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("button");
        JLabel label = new JLabel("Hey World");
        frame.add(button, BorderLayout.NORTH);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Main a = new Main();
                a.SimpleSwingApp();
            }
        });
    }
}

