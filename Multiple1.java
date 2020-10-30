class Electronics
{
void display()
{
System.out.println("examples of electronic devices are computers, mobile phones, remotes, and cameras");
}
}
class Mobile extends Electronics
{
void smartPhone()
{
System.out.println("smart phone is an electronic device and it has features like touchscreen,front and back cameras");
}
}
class Oneplus extends Mobile
{
void camera()
{
System.out.println("oneplus is a mobile and it has a quad camera which is 64mp*12*8*8");
}
}
class Multiple1
{
public static void main(String args[])
{
Oneplus op=new Oneplus();
op.display();
op.smartPhone();
op.camera();
}
}