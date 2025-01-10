package wzk.test;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class HelloKitty extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillOval(50, 50, 200, 200);
        g2d.setColor(Color.PINK);
        g2d.fillOval(80, 80, 140, 140);
        g2d.setColor(Color.BLACK);
        g2d.fillOval(110, 120, 20, 20);
        g2d.fillOval(170, 120, 20, 20);
        g2d.setColor(Color.BLACK);
        g2d.fillOval(140, 150, 20, 20);
        g2d.setColor(Color.RED);
        g2d.drawArc(120, 160, 60, 40, 0, -180);
        g2d.setColor(Color.PINK);
        g2d.fillRect(120, 80, 60, 40);
        g2d.fillRect(150, 80, 10, 90);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Kitty");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new HelloKitty());
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}