interface Laptop
{
void ram();
void storage();
void os();
}
interface Electronic
{
void power();
void charger();
}
class HpLaptop implements Laptop,Electronic
{
public void ram()
{
System.out.println("ram: 8gb");
}
public void storage()
{
System.out.println("Storage: 1tb");
}
public void os()
{
System.out.println("os: windows 10");
}
public void power()
{
System.out.println("laptop requires power to run");
}
public void charger()
{
System.out.println("laptop need charger to charget it");
}
}
class Interface3
{
public static void main(String args[])
{
HpLaptop hp =new HpLaptop();
hp.ram();
hp.storage();
hp.os();
hp.power();
hp.charger();
}
}