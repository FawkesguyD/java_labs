package org.example.lab5.ex1;

import javax.swing.*;
import java.awt.*;

public class img {
    private Image img;
    public String urlImg = "null";
    public img() {
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
    }

    public void loadImage(String src) {
        img = new ImageIcon(src).getImage();
    }

    public void drawIcon() {
        Graphics g = img.getGraphics();
        g.drawImage(img, 0, 0, null);
    }

}
