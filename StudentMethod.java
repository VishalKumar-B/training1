class University
{
void listOfColleges()
{
	System.out.println("1.CVR 2.CVSR 3.CMR 4.JNTU");
}
void selectCollege(int clg_code1,int clg_code2)
{
	System.out.println("college codes selected are: " +clg_code1+","+clg_code2);
}
String seatAlloted()
{
	return "3.CMR";
}

String payFee(float fee)
{
	System.out.println("pay fee: " +fee);
	return "fee paid";
}
}

class StudentMethod
{
public static void main(String args[])
{
University un=new University();
un.listOfColleges();
un.selectCollege(1,3);
System.out.println("Seat alloted is " +un.seatAlloted());
System.out.println(un.payFee(23334.44f));
}
}