package com.filesystems;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClassProgram {

	public static void main(String[] args) {

		try {
			Writer w = new FileWriter("C:\\Users\\Home\\Desktop\\a.txt");
			String s = "virat kohli";
			w.write(s);
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
