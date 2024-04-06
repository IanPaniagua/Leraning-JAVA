package Abstraction;

public class Main_Abstraction {

	public static void main(String[] args) {
		// abstract= abstract classes cannot be instantiated, but they can have a subclass
		//			abstract methods are declared without an implementation.

		Vehicle vehicle = new Vehicle();  //now we can´t instantiated vehicle. because this is abstract! 
		Car car = new Car();
		
		car.go();
	}

}
