import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{
    int clicks = 0;
    private JLabel label;
    private JButton button;
    private JPanel panel;
    public Main() {
        JFrame frame = new JFrame("My app");
        frame.setSize(1024, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("button");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");
        panel = new JPanel();

        panel.add(button);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks: " + clicks);
    }
}

