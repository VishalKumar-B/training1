import java.util.Scanner;
class Rectangle
{
int l,b;
Scanner sc=new Scanner(System.in);
public void display() 
{
System.out.println("enter length and breadth of rectangle");
l=sc.nextInt();
b=sc.nextInt();
System.out.println("length and breadth of rectangle is: " +l+ " and " +b);
}
}
class AreaOfRectangle extends Rectangle
{
public void area() 
{
System.out.println("area is: " +(l*b));
}
}
public class SingleInheritence2 
{
public static void main(String[] arguments) 
{
AreaOfRectangle a = new AreaOfRectangle();
a.display();
a.area();
}
}