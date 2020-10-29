class Employee
{
int employee_id;
String employee_name;
String employee_email;
String mobile_number;
String designation;
String company_name;
float employee_salary;


Employee(int employee_id,String employee_name,String employee_email,String mobile_number,String designation,String company_name,float employee_salary)
{
this.employee_id=employee_id;
this.employee_name=employee_name;
this.employee_email=employee_email;
this.mobile_number=mobile_number;
this.designation=designation;
this.company_name=company_name;
this.employee_salary=employee_salary;
this.display();
}
void display()
{
System.out.println("Id: " +employee_id);
System.out.println("Name: " +employee_name);
System.out.println("email-Id: " +employee_email);
System.out.println("Contact number: " +mobile_number);
System.out.println("Designation: " +designation);
System.out.println("Company Name: " +company_name);
System.out.println("Salary: " +employee_salary);
}
}

class ExampleConstructor
{
public static void main(String args[])
{
Employee raju=new Employee(12,"raju","raju12@gmail.com","9876543210","software engineer","JNIT",21000.00f);
Employee shekar=new Employee(13,"shekar","shekar12@gmail.com","1234567890","manager","JNIT",45000.00f);
}
}