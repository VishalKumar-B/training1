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

class Mobile
{
public static void main(String args[])
{
Iphone a=new Iphone();
Iphone.company_name="Apple";
a.model="iphone12";
a.network="5G";
a.length=146.7f;
a.width=71.5f;
a.thickness=7.4;
a.weight="164g";
a.ram=4;
a.rom=64;
a.display_type="Super Retina XDR OLED HDR10";
a.chipset="A14 bionic chip";
a.battery_capacity=2815;

System.out.println("----------mobile information----------");
System.out.println("Company Name: " +Iphone.company_name);
System.out.println("Model: "+a.model);
System.out.println("Network: "+a.network);
System.out.println("Length: "+a.length);
System.out.println("Width: "+a.width);
System.out.println("Thickness: "+a.thickness);
System.out.println("Weight: "+a.weight);
System.out.println("Ram(in GB): "+a.ram);
System.out.println("Rom(in GB): "+a.rom);
System.out.println("Display type: "+a.display_type);
System.out.println("Chipset: "+a.chipset);
System.out.println("Battery capacity: "+a.battery_capacity);
}
}