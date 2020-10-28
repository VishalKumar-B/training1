class Bike
{
static String company_name;
String model;
String emission_type;
int gear_box;
String abs;
String wheel_type;
float engine_displ;
String max_power;
String fuel_type;
String tyre_type;
float price;
}

class BikeInfo
{
public static void main(String args[])
{
Bike b1=new Bike();
Bike.company_name="Bajaj";
b1.model="Pulsar 150";
b1.emission_type="BS6";
b1.gear_box=5;
b1.abs="single channel";
b1.wheel_type="Alloy";
b1.engine_displ=149.5f;
b1.max_power="14 PS @ 8500 rpm";
b1.fuel_type="petrol";
b1.tyre_type="tubeless";
b1.price=98845.00f;

System.out.println("----------bike information----------");
System.out.println("Company Name: " +Bike.company_name);
System.out.println("Model: " +b1.model);
System.out.println("Emission Type " +b1.emission_type);
System.out.println("Number of gears: " +b1.gear_box);
System.out.println("ABS: " +b1.abs);
System.out.println("Wheel Type: " +b1.wheel_type);
System.out.println("Engine Displ: " +b1.engine_displ);
System.out.println("Max Power: " +b1.max_power);
System.out.println("Fuel Type: " +b1.fuel_type);
System.out.println("Tyre Type: " +b1.tyre_type);
System.out.println("Price: " +b1.price);
}
}