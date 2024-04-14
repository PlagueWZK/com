package wzk.war.screen;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    private Panel mp;
    public static void main(String[] args) {
        new MyFrame();
    }
    public MyFrame()  {
        mp = new Panel();
        this.add(mp);
        this.setSize(1600,900);
        this.setVisible(true);
    }
}

class Panel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
    }
}