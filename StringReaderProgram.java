package com.filesystems;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderProgram {

	public static void main(String[] args) throws IOException {
		String s = "this is string reader class";
		
		StringReader sr = new StringReader(s);
		int i = sr.read();
		while(i != -1)	{
			System.out.print((char)i);
			i = sr.read();
		}

	}

}
