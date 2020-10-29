class Laptop
{
String company_name;
String model;
float length;
float width;
double thickness;
String weight;
int ram;
int storage;
String display_type;
String processor;
int battery_capacity;

Laptop(String company_name,String model,float length,float width,double thickness,String weight,int ram,int storage,String display_type,String processor,int battery_capacity)
{
this.company_name=company_name;
this.model=model;
this.length=length;
this.width=width;
this.thickness=thickness;
this.weight=weight;
this.ram=ram;
this.storage=storage;
this.display_type=display_type;
this.processor=processor;
this.battery_capacity=battery_capacity;
this.display();
}

void display()
{
System.out.println("Company Name: " +company_name);
System.out.println("Model: "+model);
System.out.println("Length(in inches): "+length);
System.out.println("Width(in inches): "+width);
System.out.println("Thickness(in mm): "+thickness);
System.out.println("Weight: "+weight);
System.out.println("Ram(in GB): "+ram);
System.out.println("Storage(in TB): "+storage);
System.out.println("Display type: "+display_type);
System.out.println("Processor: "+processor);
System.out.println("Battery capacity: "+battery_capacity);
}
}

class LaptopConstructor
{
public static void main(String args[])
{
Laptop thinkpad=new Laptop("Lenovo","Thinkpad",14,18,30.6,"1.69kg",8,1,"LED","intel i7",6800);
Laptop rog=new Laptop("Asus","rog 12",16,18,26.7,"2.4kg",16,2,"OLED","Ryzen 7",8000);
}
}