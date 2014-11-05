package com.kronoze;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Jyrix {
	
	private static Properties settings = new Properties();
	private static File directory = new File("C:\\Users\\dy9506qm.NW\\Desktop\\Jyrix");
	
	public static void main(String[] args) throws IOException {
		directory.mkdirs();
		File settingsFile = new File(directory, "settings.cfg");
		if (!settingsFile.exists()) {
			try {
				settingsFile.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		settings.load(new FileInputStream(settingsFile));
		settings.setProperty("date", "eh");
		
	}
	
}
