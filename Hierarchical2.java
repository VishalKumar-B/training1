class Electronics
{  
void power()
{
System.out.println("all electronic devices require power");
}  
}  
class Mobile extends Electronics
{  
void iphone()
{
System.out.println("iphone runs on ios14");
}  
}  
class Laptop extends Electronics
{  
void dellLaptop()
{
System.out.println("dell laptop runs on windows 10");
}  
}  
class Hierarchical2
{  
public static void main(String args[])
{  
Laptop lp=new Laptop();
lp.power();
lp.dellLaptop();
Mobile m=new Mobile();
m.power();
m.iphone();  
}
}  