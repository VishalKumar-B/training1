class Addition
{
void add(int a, int b)
{
System.out.println(a+b);
}
void add(float a,float b,float c)
{
System.out.println(a+b);
}
void add(double a,double b)
{
System.out.println(a+b);
}
void add(double i,int j)
{
System.out.println(i+j);
}
void add(double i,int j,float k)
{
System.out.println(i+j+k);
}
}
class Sum
{
public static void main(String args[])
{
Addition a=new Addition();
a.add(4,5);
a.add(3.4f,8.9f,9.7f);
a.add(3.3,4.4);
a.add(8.7,4);
a.add(2.3,5,1.2f);
}
}
