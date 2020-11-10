package com.filesystems;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterProgram {

	public static void main(String[] args) throws IOException {
		
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("abc");
		
		FileWriter fw=new FileWriter("C:\\Users\\Home\\Desktop\\c.txt");  
		caw.writeTo(fw);
		fw.close();
	}

}
