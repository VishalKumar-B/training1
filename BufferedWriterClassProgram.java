package com.filesystems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClassProgram {

	public static void main(String[] args) throws IOException {

		FileWriter w = new FileWriter("C:\\Users\\Home\\Desktop\\b.txt");
		BufferedWriter bw = new BufferedWriter(w);
		bw.write("this is buffered writer class");
		bw.close();
	}

}
