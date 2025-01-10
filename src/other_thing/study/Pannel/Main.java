package Test.Pannel;

import javax.swing.*;

public class Main extends JFrame {
    public static Panel panel = new Panel();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        setTitle("Tank Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
        add(panel);
    }

}
