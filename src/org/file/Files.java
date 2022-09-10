package org.file;

import java.io.File;
import java.io.IOException;

public class Files {
	public static void main(String[] args) throws IOException {
		File aa = new File("D:\\photo");
		
	 
	String[] list = aa.list();
	for (String string : list) {
		
	
	System.out.println(string);
	}
	
	
	File[] listFiles = aa.listFiles();
	for (File file : listFiles) {
	System.out.println(file);	
	}
	
	
	}

}
