import java.util.Scanner;
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

class ScannerBikeInfo
{
public static void main(String args[])
{
Bike bike=new Bike();
Scanner sc=new Scanner(System.in);
System.out.println("enter bike details company name, model, emission type, gear box, abs, wheel type, engine displ, max power, fuel type, tyre type, price");
Bike.company_name=sc.next();
bike.model=sc.next();
bike.emission_type=sc.next();
bike.gear_box=sc.nextInt();
bike.abs=sc.next();
bike.wheel_type=sc.next();
bike.engine_displ=sc.nextFloat();
bike.max_power=sc.next();
bike.fuel_type=sc.next();
bike.tyre_type=sc.next();
bike.price=sc.nextFloat();

System.out.println("----------bike information----------");
System.out.println("Company Name: " +Bike.company_name);
System.out.println("Model: " +bike.model);
System.out.println("Emission Type " +bike.emission_type);
System.out.println("Number of gears: " +bike.gear_box);
System.out.println("ABS: " +bike.abs);
System.out.println("Wheel Type: " +bike.wheel_type);
System.out.println("Engine Displ: " +bike.engine_displ);
System.out.println("Max Power: " +bike.max_power);
System.out.println("Fuel Type: " +bike.fuel_type);
System.out.println("Tyre Type: " +bike.tyre_type);
System.out.println("Price: " +bike.price);
}
}