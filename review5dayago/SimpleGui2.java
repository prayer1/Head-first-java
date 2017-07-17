package com.review5dayago;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Administrator on 2017/7/15.
 */
public class SimpleGui2 implements ActionListener {
    JFrame frame;
    public static void main(String[] args){
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
        System.out.print(1);
    }
}
