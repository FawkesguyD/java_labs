package org.example.lab6.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MovableInterface extends MovablePoint{

    private boolean isLeft = false;
    private boolean isRight = false;
    private boolean isUp = false;
    private boolean isDown = false;

    JButton obj = new JButton();
    JButton leftbutton = new JButton();

    public MovableInterface() {
        super(250, 95);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.setLayout(null);

        JPanel screen = new JPanel();
        screen.setBackground(Color.DARK_GRAY);
        screen.setBounds(0,0, 500,190);

        screen.setLayout(null);
        obj.setBounds(getX(),getY(), 10, 10);
        obj.setBackground(Color.WHITE);
        screen.add(obj);

        leftbutton.setBounds(200,250, 50, 50);
        leftbutton.setBackground(Color.WHITE);

        JButton rightButton = new JButton();
        rightButton.setBounds(300,250, 50, 50);
        rightButton.setBackground(Color.WHITE);

        JButton upButton = new JButton();
        upButton.setBounds(250,200, 50, 50);
        upButton.setBackground(Color.WHITE);

        JButton downButton = new JButton();
        downButton.setBounds(250,300, 50, 50);
        downButton.setBackground(Color.WHITE);

        upButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                moveUp();
                obj.setBounds(getX(),getY(), 10, 10);
                System.out.println("up");
            }
        });

        downButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                moveDown();
                obj.setBounds(getX(),getY(), 10, 10);
                System.out.println("down");
            }
        });

        leftbutton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                moveLeft();
                obj.setBounds(getX(),getY(), 10, 10);
                System.out.println("left");
            }
        });

        rightButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                moveRight();
                obj.setBounds(getX(),getY(), 10, 10);
                System.out.println("right");
            }
        });




        frame.add(rightButton);
        frame.add(leftbutton);
        frame.add(upButton);
        frame.add(downButton);
        frame.add(screen, BorderLayout.NORTH);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) isLeft = true;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) isRight = true;
        if (e.getKeyCode() == KeyEvent.VK_DOWN) isDown = true;
        if (e.getKeyCode() == KeyEvent.VK_UP) isUp = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MovableInterface();
            }
        });
    }
}
