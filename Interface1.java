interface Vehicle
{
void petrol();
void wheels();
}
class Car implements Vehicle
{
public void petrol()
{
System.out.println("petrol is required for car");
}
public void wheels()
{
System.out.println("Wheels are required for car");
}
}
class Interface1
{
public static void main(String args[])
{
Car bmw =new Car();
bmw.wheels();
bmw.petrol();
}
}
