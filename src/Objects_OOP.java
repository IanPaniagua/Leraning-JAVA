
public class Objects_OOP {

	public static void main(String[] args) {
		
		// object = an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, coffee cup)

		car_OOP myCar = new car_OOP();
		
		System.out.println(myCar.make);   //call the attributes of the method car_OOP
		System.out.println(myCar.model);
		
		myCar.drive();
		myCar.brake();
	}

}
