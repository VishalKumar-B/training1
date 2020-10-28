class Student
{
int id;
String name;
String fathername;
String branch;
char section;
static String clgname;
static String clgaddress;
int marks;
float percentage;
float gpa;
}
class Employee
{
int employee_id;
String employee_name;
String employee_email;
String mobile_number;
String designation;
static String company_name;
static String company_location;
float employee_salary;
}

class Example1
{
public static void main(String args[])
{
Student s1=new Student();
s1.id=123;
s1.name="Raju";
s1.fathername="Ramaraju";
s1.branch="CSE";
s1.section='D';
Student.clgname="XYZ";
Student.clgaddress="hyderabad";
s1.marks=658;
s1.percentage=76.6f;
s1.gpa=7.6f;

System.out.println("--------------Student information--------------");
System.out.println("Id: " +s1.id);
System.out.println("Name: " +s1.name);
System.out.println("Father's name: " +s1.fathername);
System.out.println("Branch: " +s1.branch);
System.out.println("Section: " +s1.section);
System.out.println("College name: " +Student.clgname);
System.out.println("College Location: " +Student.clgaddress);
System.out.println("Marks: " +s1.marks);
System.out.println("Percentage: " +s1.percentage);
System.out.println("GPA: " +s1.gpa);

Employee emp=new Employee();
emp.employee_id=1234;
emp.employee_name="suman";
emp.employee_email="abc@gmail.com";
emp.mobile_number="9876543210";
emp.designation="software engineer";
Employee.company_name="JNIT";
Employee.company_location="kondapur";
emp.employee_salary=25000.55f;

System.out.println("--------------Employee information--------------");
System.out.println("Id: " +emp.employee_id);
System.out.println("Name: " +emp.employee_name);
System.out.println("email-Id: " +emp.employee_email);
System.out.println("Contact number: " +emp.mobile_number);
System.out.println("Designation: " +emp.designation);
System.out.println("Company Name: " +Employee.company_name);
System.out.println("Company Location: " +Employee.company_location);
System.out.println("Salary: " +emp.employee_salary);
}
}
