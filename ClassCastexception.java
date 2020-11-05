package com.Exceptions;

class A
{
  int x=10;
}
 
class B extends A
{
     int y=20;
}
 
class C extends B
{
    int z=30;
}
public class ClassCastexception {
	public static void main(String[] args)
    {
        A a = new B();
        System.out.println(a.x);
        B b = (B) a; 
        System.out.println(b.y);
        C c = (C) b;
        System.out.println(c.z);
    }
}
