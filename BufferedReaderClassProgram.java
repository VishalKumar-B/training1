package com.filesystems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClassProgram {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Home\\Desktop\\b.txt");
		BufferedReader br = new BufferedReader(fr);

		int i = br.read();
		while (i != -1) {
			System.out.print((char) i);
			i = br.read();
		}
		br.close();
		fr.close();
	}
}
