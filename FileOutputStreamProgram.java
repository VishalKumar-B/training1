package com.filesystems;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamProgram {

	public static void main(String args[]) {
		
		try {

			FileOutputStream fos = new FileOutputStream("C:\\Users\\Home\\Desktop\\abcd.txt");
			
			String name = "Files concepts";
			fos.write(name.getBytes());
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
