class Rectangle
{
void area(int length,int breadth)
{
System.out.println("area of triangle is: " +length*breadth );
}
void area(float length,float breadth)
{
System.out.println("area of triangle is: " +length*breadth);
}
void area(int length,double breadth)
{
System.out.println("area of triangle is: " +length*breadth);
}
void area(String area)
{
System.out.println("def:" +area);
}
}
class Area
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.area(5,5);
r1.area(6.5f,4.5f);
r1.area(7,9.7);
r1.area("area is calculated by multiplying length and breadth");
}
}