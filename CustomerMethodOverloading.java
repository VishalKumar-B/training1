class Restuarant
{
void takeOrder(String order)
{
    System.out.println("order given is: " +order);
}
void takeOrder(String order1,String order2)
{
    System.out.println("order given is: " +order1+ "and" +order2);
}
void takeOrder(String order1,String order2,String order3)
{
    System.out.println("order given is: " +order1+ "," +order2+ "," +order3);
}
}

class CustomerMethodOverloading
{
public static void main(String args[])
{
Restuarant barbique=new Restuarant();
barbique.takeOrder("chicken");
barbique.takeOrder("fish","ice cream");
barbique.takeOrder("rice","soop","desert");
}
}