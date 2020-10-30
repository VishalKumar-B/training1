import java.util.Scanner;
class Square
{
int a,b;
Scanner sc=new Scanner(System.in);
void area()
{
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("area of square is: " +a*a);
}
}
class Sum extends Square
{
void sum1()
{
System.out.println("enter b value");
b=sc.nextInt();
System.out.println("sum of a and b is " + (a+b));
}
}
class SingleInheritence1
{
public static void main(String args[])
{
Sum s=new Sum();
s.area();
s.sum1();
}
}
