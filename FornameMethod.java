package com.threads;

class GetName{
	static {
		System.out.println("Get Name Static block");
	}
	GetName(){
		System.out.println("Get Name Constructor");
	}
}
class NewInstance{
	static {
		System.out.println("New Instance Static block");
	}
	NewInstance(){
		System.out.println("New Instance Constructor");
	}
}
public class FornameMethod {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class C=Class.forName("com.threads.NewInstance");
		System.out.println(C.getName());
		System.out.println(C.newInstance());
	}
}
