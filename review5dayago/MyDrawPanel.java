package com.review5dayago;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/7/16.
 */
public class MyDrawPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        int r = (int)(Math.random()*255);
        int gr = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);
        Color startColor = new Color(r, gr, b);

        r = (int)(Math.random()*255);
        gr = (int)(Math.random()*255);
        b = (int)(Math.random()*255);
        Color endColor = new Color(r, gr, b);

        GradientPaint gradient = new GradientPaint(40, 40, startColor, 60, 60, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}
