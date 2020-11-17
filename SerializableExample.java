package com.threads;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Example implements Serializable {

	int id;
	String name;
	int marks;

	public Example(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class SerializableExample {

	public static void main(String[] args) throws IOException {

		Example e = new Example(10, "abc", 230);
		FileOutputStream fis = new FileOutputStream("C:\\Users\\Home\\Desktop\\serializable.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(e);
		oos.flush();
		oos.close();
	}
}
