package org.file;

import java.io.File;
import java.io.IOException;

public class Fill {
	public static void main(String[] args) throws IOException {
		
		File bb = new File("D:\\photo\\WhatsApp Images\\MeRsal");
		
		boolean mkdir = bb.mkdir();
		System.out.println(mkdir);
		
		boolean createNewFile = bb.createNewFile();
		System.out.println(createNewFile);
		
		boolean exists = bb.exists();
		System.out.println(exists);
		
		boolean canRead = bb.canRead();
		System.out.println(canRead);
		
		boolean canWrite = bb.canWrite();
		System.out.println(canWrite);
		
		boolean file = bb.isFile();
		System.out.println(file);
		
		boolean directory = bb.isDirectory();
		System.out.println(directory);
	
		String[] list = bb.list();
		for (String string : list) {
			System.out.println(string);
		}
	
	
	File[] listFiles = bb.listFiles();
	for (File file2 : listFiles) {
		
	
	System.out.println(file2);
	}
	
	}
	
	
	
	
	
	
	
	
	
	

}
