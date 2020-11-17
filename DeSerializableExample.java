package com.threads;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Home\\Desktop\\serializable.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object o = ois.readObject();
		Example e = (Example) o;
		System.out.println(e.id+" "+e.name+" "+e.marks);
		ois.close();
	}

}
