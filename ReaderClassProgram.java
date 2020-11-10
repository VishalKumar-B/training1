package com.filesystems;

import java.io.FileReader;
import java.io.Reader;

public class ReaderClassProgram {

	public static void main(String[] args) {

		try {
			
			Reader r = new FileReader("C:\\Users\\Home\\Desktop\\a.txt");
			int data = r.read();
			while (data != -1) {
				System.out.print((char) data);
				data = r.read();
			}
			r.close();
		} 
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
