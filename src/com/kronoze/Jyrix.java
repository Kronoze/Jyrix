package com.kronoze;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.*;
import java.awt.*;

public class Jyrix {

	private static Properties settings = new Properties();
	private static File directory = new File("C:\\Users\\dy9506qm.NW\\Desktop\\Jyrix");
	
	private static JTextField songInput;
	
	@SuppressWarnings("unused")
	private static void createWindow() {
		JFrame frame = new JFrame("Jyrix");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 200));
		
		songInput = new JTextField(1);
		
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static String now() {
		return (new java.util.Date()).toString();
	}
	
	public static void main(String[] args) throws IOException {
		directory.mkdirs();
		File settingsFile = new File(directory, ".properties");
		
		if (!settingsFile.exists()) {
			settingsFile.createNewFile();
		}
		FileInputStream input = new FileInputStream(settingsFile);
		FileOutputStream output = new FileOutputStream(settingsFile);
		
		settings.load(input);
		settings.setProperty("date", now());
		
		settings.list(System.out);
		
		settings.storeToXML(output, null);
		
		
		
		output.close();
		
		Jyrix.createWindow();
		
	}
	
}
