import java.util.Scanner;
class Student
{
String sname;
int id,marks;
float percentage;
Scanner sc=new Scanner(System.in);
void details()
{
System.out.println("enter Student id and name");
id=sc.nextInt();
sname=sc.next();
}
}
class ProgressReport extends Student
{
void calculatePer()
{
System.out.println("enter total marks: ");
marks=sc.nextInt();
System.out.println("id: " +id);
System.out.println("name: " +sname);
System.out.println("marks: " +marks);
System.out.println("percentage: " +((marks*6)/100));
}
}
class SingleInheritence3
{
public static void main(String args[])
{
ProgressReport pr=new ProgressReport();
pr.details();
pr.calculatePer();
}
}