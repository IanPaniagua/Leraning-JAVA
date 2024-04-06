package Inheritance;

public class Inheritance {

	public static void main(String[] args) {
//Heritance = the process where one class asquires,
		//		the attributes and methods of another.

	Bicycle bicycle = new Bicycle();	
	Car car = new Car();
	car.go();
	bicycle.go();
	
	System.out.println(car.speed);
	System.out.println(bicycle.speed);
	}

}
