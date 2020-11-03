abstract class Car {
	abstract void cost();
	abstract void millage();
}
class AnonymousInnerCar {
	public static void main(String args[]) {
	Car a = new Car() {
		void cost(){System.out.println("cost is 9lakhs");}
		void millage(){System.out.println("millage is 18km");}
	};
	a.cost();
	a.millage();
}
}
