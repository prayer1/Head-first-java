package com.day4;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class SimpleGui3C implements ActionListener {
	JFrame frame;
	public static void main(String[] args){
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("change colors");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.repaint();		
	}
}
