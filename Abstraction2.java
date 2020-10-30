abstract class Mobile
{
abstract void ram();
abstract void storage();
void powerButton()
{
System.out.println("Every mobile has a power button");
}
}

class Oneplus extends Mobile
{
void ram()
{
System.out.println("Ram: 8gb");
}
void storage()
{
System.out.println("Storage: 128gb");
}
}

class Iphone extends Mobile
{
void ram()
{
System.out.println("Ram: 4gb");
}
void storage()
{
System.out.println("storage: 128gb");
}
}

class Abstraction2
{
public static void main(String args[])
{
Mobile m=new Oneplus();
System.out.println("oneplus specifications");
m.ram();
m.storage();
m=new Iphone();
System.out.println("Iphone specifications");
m.ram();
m.storage();
}
}