package com.filesystems;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterProgram {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter(System.out); // to write on console
		pw.write("hello");
		pw.close();
		
		PrintWriter pw1 = new PrintWriter(new File("C:\\Users\\Home\\Desktop\\d.txt")); // to write in class
		pw1.write("in print writer class");
		pw1.close();
		
	}

}
