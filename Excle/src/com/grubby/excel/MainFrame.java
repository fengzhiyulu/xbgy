package com.grubby.excel;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	JPanel panel = null;
	JLabel label = null;

	public MainFrame(){
		this.setVisible(true);
		this.setSize(600, 800);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new MainPanel();
		this.setContentPane(panel);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
	}
}
