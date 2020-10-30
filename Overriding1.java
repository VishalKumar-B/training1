class Car 
{
void cost()
{
System.out.println("no cost");
}
void mileage()
{
System.out.println("no mileage");
}
}

class Audi extends Car
{
void cost()
{
System.out.println("cost is 20lakhs");
}
void mileage()
{
System.out.println("mileage is 17km");
}
}

class Bmw extends Car
{
void cost()
{
System.out.println("cost is 30lakhs");
}
void mileage()
{
System.out.println("mileage is 21km");
}
}

class Overriding1
{
public static void main(String args[])
{
Car x=new Car();
x.cost();
x.mileage();
x=new Audi();
x.cost();
x.mileage();
x=new Bmw();
x.cost();
x.mileage();
}
}