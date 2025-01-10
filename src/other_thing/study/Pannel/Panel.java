package Test.Pannel;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Image img;
    public Panel() {
        img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/VB.gif"));
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img, 500, 500, this);
    }
}
