package com.day4;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class TwoButton {
	JFrame frame;
	JLabel label;
	
	public static void main(String[] args){
		TwoButton gui = new TwoButton();
		gui.go();
	}
	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Change Label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change Circle");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("I'm a label");
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	class LabelListener implements ActionListener{		
		public void actionPerformed(ActionEvent arg0) {
			label.setText("Ouch!");			
		}		
	}
	
	class ColorListener implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			frame.repaint();
			
		}
		
	}
}
