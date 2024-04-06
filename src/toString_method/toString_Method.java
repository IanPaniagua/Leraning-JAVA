package toString_method;

public class toString_Method {

	public static void main(String[] args) {
// toString() = special method that all objects inherit,
		//		that return a string that "textually represents" an object.
		//		can be used both implicitly and explicitly

	
	Car car = new Car();
	
	//this is one way to print the values from Car()
	System.out.println(car.marke);
	System.out.println(car.model);
	System.out.println(car.color);
	System.out.println(car.year);
	
	//There is a fast way
	
	System.out.println("now with toString_method:");
	System.out.println(car.toString());
	//oder
	System.out.println("we can now do it like these as well ( car ) ");
	System.out.println(car);
	}

	
}
