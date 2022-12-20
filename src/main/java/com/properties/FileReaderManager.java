package com.properties;

import java.io.IOException;

public class FileReaderManager {
	
	//private constructor
	private FileReaderManager() {
		
		// we can't create object another class.
	}
	
	
	//static method
	public static FileReaderManager getInstancceFRM() {
		
		FileReaderManager frm = new FileReaderManager();
		
		return frm;
	}
	
	//non static method
	public ConfigurationReader getInstanceCR() throws IOException {
		
		ConfigurationReader cr = new ConfigurationReader();
		
		return cr;
	}

}
