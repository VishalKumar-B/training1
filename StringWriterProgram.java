package com.filesystems;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class StringWriterProgram {

	public static void main(String[] args) throws IOException {

		char[] ch = new char[512];
		StringWriter sw = new StringWriter();
		 FileInputStream fis = null;  
	     BufferedReader br = null;  
	     fis = new FileInputStream("C:\\Users\\Home\\Desktop\\d.txt");  
	     br = new BufferedReader(new InputStreamReader(fis)); 
		
	     int x;  
	     while ((x = br.read(ch)) != -1) {  
	                   sw.write(ch, 0, x);  
	     }  
		System.out.println(sw.toString());
		sw.close();
		br.close();

	}

}
