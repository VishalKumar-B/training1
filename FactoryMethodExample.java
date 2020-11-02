abstract class Bike{
abstract void cost();
abstract void fuelcapacity();

void start(){
System.out.println("start with key");
}
}

class Cbz extends Bike{
 void cost(){
  System.out.println("cost is: 96000");
 }
 void fuelcapacity(){
  System.out.println("fuel capacity: 15");
 }
}

class Fz extends Bike{
 void cost(){
  System.out.println("cost is: 100000");
 }
 void fuelcapacity(){
  System.out.println("Ram of Oneplus is: 8GB");
 }
 void harddisk(){
  System.out.println("fuel capacity: 12");
 }
}

class BikeFactory{
 static Bike getBike(String mobileName){
  if(mobileName.equalsIgnoreCase("Redmi")){
   return new Redmi();
  }
  else if(mobileName.equalsIgnoreCase("Oneplus")){
   return new Oneplus();
  }
  else {
   return null;
  }
 }
}
class FactoryMethodExample{
public static void main(String args[]){
Bike b=BikeFactory.getBike(args[0]);
b.cost();
b.fuelcapacity();
}
}