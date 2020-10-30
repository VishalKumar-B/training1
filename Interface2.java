interface Office
{
public void employees();
public void teamLeads();
}
class Jnit implements Office
{
public void employees()
{
System.out.println("total number of employees are 700");
}
public void teamLeads()
{
System.out.println("total number of teamLeads are 300");
}
}
class Interface2
{
public static void main(String args[])
{
Jnit j=new Jnit();
j.employees();
j.teamLeads();
}
}