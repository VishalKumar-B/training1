class Restuarant
{
void menu()
{
System.out.println("1.idly 2.dosa 3.idly 4.poori");
}
void takeOrder(String order)
{
System.out.println("order given is "+order);
}
String serveFood()
{
return "dosa";
}
int giveBill()
{
return 788;
}
String payBill(int amount)
{
System.out.println("amount given is "+amount);
return "paid";
}
}
class Customer
{
public static void main(String args[])
{
Restuarant bbq=new Restuarant();
bbq.menu();
bbq.takeOrder("Dosa");
System.out.println("food served is: "+bbq.serveFood());
System.out.println("Bill is: "+bbq.giveBill());
System.out.println("Bill "+bbq.payBill(421));
}
}