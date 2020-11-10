package com.filesystems;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderClassProgram {

	public static void main(String[] args) throws IOException {

		char[] a = { 'v', 'i', 'r', 'a', 't' };
		CharArrayReader reader = new CharArrayReader(a);
		int i = reader.read();
		while (i != -1) {
			char ch = (char) i;
			System.out.print(ch + ":");
			System.out.println(i);
			i = reader.read();
		}

	}

}
