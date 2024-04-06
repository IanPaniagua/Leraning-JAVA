package toString_method;

public class Car {

	String marke = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;
	
	//let´s override the toString method
	
	public String toString() {
		
		
		return marke + "\n"+model+ "\n" + color + "\n" + year;
	}
	
}
