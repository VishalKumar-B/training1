class Car
{
String company_name;
String model;
int engine_displacement;
int seating_capacity;
int boot_space;
String body_type;
float fulltank_capacity;
String fueltype;
float service_cost;
float price;

Car(String company_name,String model,int engine_displacement,int seating_capacity,int boot_space,String body_type,float fulltank_capacity,String fueltype,float service_cost,float price)
{
this.company_name=company_name;
this.model=model;
this.engine_displacement=engine_displacement;
this.seating_capacity=seating_capacity;
this.boot_space=boot_space;
this.body_type=body_type;
this.fulltank_capacity=fulltank_capacity;
this.fueltype=fueltype;
this.service_cost=service_cost;
this.price=price;
this.display();
}
void display()
{
System.out.println("Company name: "+company_name);
System.out.println("Model:"+model);
System.out.println("Engine displacement(cc): "+engine_displacement);
System.out.println("Seating capacity: "+seating_capacity);
System.out.println("Boot space(liters): "+boot_space);
System.out.println("Body type: "+body_type);
System.out.println("Full tank capacity: "+fulltank_capacity);
System.out.println("Fuel type: "+fueltype);
System.out.println("Service cost: "+service_cost);
System.out.println("Price: "+price);
}
}

class CarConstructor
{
public static void main(String args[])
{
Car setlos=new Car("Kia motors","Setlos",1493,5,433,"SUV",50.01f,"Disel",4579.00f,1500000.00f);
Car fortuner=new Car("Toyota","Fortuner2020",1699,7,899,"SUV",50.01f,"Disel",10000,3400000.00f);
}
}