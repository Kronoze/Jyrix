package com.kronoze;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Jyrix extends JFrame implements ActionListener, WindowListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private static Properties settings = new Properties();
	private static File directory = new File("C:\\Users\\dy9506qm.NW\\Desktop\\Jyrix");
	
	private static JTextField songInput;
	private static JButton submit;
	
	public Jyrix() {
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(300, 200));
		
		// song input field
		songInput = new JTextField(10);
		//songInput.setSize(new Dimension(70, 20));
		songInput.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		// submit button
		submit = new JButton("Submit");
		
		this.add(songInput);
		this.add(submit);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);
		this.addKeyListener(this);
		try {
			init();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	private static void init() throws IOException {
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
	}
	
	public static String now() {
		return (new java.util.Date()).toString();
	}
	
	public static long time() {
		return (new java.util.Date()).getTime();
	}
	
	public static void main(String[] args) throws IOException {
		new Jyrix();
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("[" + time() + "] Window opened");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("[" + time() + "] Window closing");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("[" + time() + "] Window closed");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("[" + time() + "] Window minimized");		
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("[" + time() + "] Window maximized");		
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("[" + time() + "] Window activated");		
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("[" + time() + "] Window deactivated");
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("[" + time() + "] Action performed, " + e.toString());
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
}
