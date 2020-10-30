abstract class Car
{
abstract void cost();
abstract void mileage();
void start()
{
System.out.println("starts with a key");
}
}
class Audi extends Car
{
void cost()
{
System.out.println("cost is 50lakhs");
}
void mileage()
{
System.out.println("mileage is 10km");
}
}
class Bmw extends Car
{
void cost()
{
System.out.println("cost is 80lakhs");
}
void mileage()
{
System.out.println("mileage is 10km");
}
}
class Abstract1
{
public static void main(String args[])
{
Car x=new Audi();
x.cost();
x.mileage();
x=new Bmw();
x.cost();
x.mileage();
}
}