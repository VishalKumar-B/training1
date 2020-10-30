class TwoWheeler
{
void features()
{
System.out.println("2 wheels");
System.out.println("2 seater");
}
}
class Cycle extends TwoWheeler
{
void pollution()
{
System.out.println("cycle is pollution free");
}
}
class Bike extends TwoWheeler
{
void fuel()
{
System.out.println("petrol is required for bike");
}
void drivingLicence()
{
System.out.println("driving licence is Mandatory");
}
}
class Hierarchical1
{
public static void main(String args[])
{
Bike b=new Bike();
System.out.println("---Bike information---");
b.features();
b.fuel();
b.drivingLicence();
Cycle c=new Cycle();
System.out.println("---Cycle information---");
c.features();
c.pollution();
}
}