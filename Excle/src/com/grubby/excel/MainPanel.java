package com.grubby.excel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainPanel extends JPanel{
	JButton button = null;
	public MainPanel(){
		button = new JButton("选择");
		button.addActionListener(new JFileAction());
		
		this.add(button);
	}
	
	private class JFileAction implements ActionListener{
		public JFileAction(){
			
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser jfc = new JFileChooser();
			jfc.setFileFilter(new FileFilter() {
				@Override
				public String getDescription() {
					return "aaa.xlsx";
				}

				@Override
				public boolean accept(File file) {
					if (file.isDirectory())
						return true;
					return file.getName().endsWith("xlsx");
				}
			});
			jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			jfc.showDialog(new JLabel(), "选择");
			File file = jfc.getSelectedFile();
			if (file != null && file.exists()) {
				if (file.isDirectory()) {
					System.out.println("文件�?:" + file.getAbsolutePath());
				} else if (file.isFile()) {
					System.out.println("文件:" + file.getAbsolutePath());
				}
			}
		}
		
	}
}
