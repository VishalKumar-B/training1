package com.filesystems;

//Java SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream ip1 = new FileInputStream("C:\\Users\\Home\\Desktop\\one.txt");
		FileInputStream ip2 = new FileInputStream("C:\\Users\\Home\\Desktop\\abcd.txt");
		BufferedInputStream bis1 = new BufferedInputStream(ip1);
		BufferedInputStream bis2 = new BufferedInputStream(ip2);
		SequenceInputStream inst = new SequenceInputStream(bis1, bis2);
		int i = inst.read();
		while (i != -1) {
			System.out.print((char) i);
			i = inst.read();
		}

		inst.close();
		ip1.close();
		ip2.close();
	}

}
