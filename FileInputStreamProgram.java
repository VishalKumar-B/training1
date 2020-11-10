package com.filesystems;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamProgram {
	
	public static void main(String args[]) throws IOException {
	
		FileInputStream fis = new FileInputStream("C:\\Users\\Home\\Desktop\\abcd.txt");
		

		int i = fis.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fis.read();
		}
	}
}
