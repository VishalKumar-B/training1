import java.util.Scanner;

class Student
{
int id;
String name;
String fathername;
String branch;
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

class ScannerExample1
{
public static void main(String args[])
{
Student student=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("enter student details id, name, fathername, branch, clg name, clg address, marks, percentage, gpa");
student.id=sc.nextInt();
student.name=sc.next();
student.fathername=sc.next();
student.branch=sc.next();
Student.clgname=sc.next();
Student.clgaddress=sc.next();
student.marks=sc.nextInt();
student.percentage=sc.nextFloat();
student.gpa=sc.nextFloat();

System.out.println("enter employee information id, name, email id, mobile number, designation, company name, company location, salary ");
Employee emp=new Employee();
emp.employee_id=sc.nextInt();
emp.employee_name=sc.next();
emp.employee_email=sc.next();
emp.mobile_number=sc.next();
emp.designation=sc.next();
Employee.company_name=sc.next();
Employee.company_location=sc.next();
emp.employee_salary=sc.nextFloat();


System.out.println("--------------Student information--------------");
System.out.println("Id: " +student.id);
System.out.println("Name: " +student.name);
System.out.println("Father's name: " +student.fathername);
System.out.println("Branch: " +student.branch);
System.out.println("College name: " +Student.clgname);
System.out.println("College Location: " +Student.clgaddress);
System.out.println("Marks: " +student.marks);
System.out.println("Percentage: " +student.percentage);
System.out.println("GPA: " +student.gpa);



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