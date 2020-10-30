class Animal 
{
void eat(){
System.out.println("Every animal will eat");
}
void sound()
{
System.out.println("Every animal will make a sound");
}
}
class Tiger extends Animal 
{
void eat() 
{
System.out.println("Tiger eats flesh");
}
void sound()
{
System.out.println("roars");
}
}
class Cow extends Animal
{
void eat()
{
System.out.println("cow eats grass");
}
void sound() 
{
System.out.println("ammba");
}
}
class Overriding2 {
  public static void main(String[] args) {
    Animal a = new Tiger();
    a.eat();
    a.sound();
    a=new Cow();
    a.eat();
    a.sound();
}
}
