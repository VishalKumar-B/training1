import java.util.Scanner;
class Iphone
{
static String company_name;
String model;
String network;
float length;
float width;
double thickness;
String weight;
short ram;
short rom;
String display_type;
String chipset;
int battery_capacity;
}

class ScannerMobile
{
public static void main(String args[])
{
Iphone iphone=new Iphone();
Scanner sc=new Scanner(System.in);
System.out.println("enter mobile information company name, model, network, length, width, thickness, weight, ram, rom, display type, chipset, battery capacity");
Iphone.company_name=sc.next();
iphone.model=sc.next();
iphone.network=sc.next();
iphone.length=sc.nextFloat();
iphone.width=sc.nextFloat();
iphone.thickness=sc.nextDouble();
iphone.weight=sc.next();
iphone.ram=sc.nextShort();
iphone.rom=sc.nextShort();
iphone.display_type=sc.next();
iphone.chipset=sc.next();
iphone.battery_capacity=sc.nextInt();

System.out.println("----------mobile information----------");
System.out.println("Company Name: " +Iphone.company_name);
System.out.println("Model: "+iphone.model);
System.out.println("Network: "+iphone.network);
System.out.println("Length: "+iphone.length);
System.out.println("Width: "+iphone.width);
System.out.println("Thickness: "+iphone.thickness);
System.out.println("Weight: "+iphone.weight);
System.out.println("Ram(in GB): "+iphone.ram);
System.out.println("Rom(in GB): "+iphone.rom);
System.out.println("Display type: "+iphone.display_type);
System.out.println("Chipset: "+iphone.chipset);
System.out.println("Battery capacity: "+iphone.battery_capacity);
}
}