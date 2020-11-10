package com.filesystems;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamProgram {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Home\\Desktop\\one.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String name = "Todays is Tuesday";
			bos.write(name.getBytes());
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
