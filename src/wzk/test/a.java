package wzk.test;

import java.awt.*;
import javax.swing.*;

class a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java玫瑰花代码");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK); // 设置背景颜色为黑色
        frame.setVisible(true);
        Graphics g = frame.getGraphics();

        int centerX = frame.getWidth() / 2;
        int centerY = frame.getHeight() / 2;

        g.setColor(Color.RED); // 设置绘图颜色为红色

        for (int angle = 0; angle < 360; angle++) {
            double radian = Math.toRadians(angle); // 将角度转换为弧度

            int x = (int) (centerX + Math.cos(3 * radian) * Math.cos(radian) * 100);
            int y = (int) (centerY + Math.cos(3 * radian) * Math.sin(radian) * 100);

            g.fillOval(x, y, 10, 10); // 在指定位置绘制圆形
        }
    }

}
