package Object_Passing;

public class Object_Passing {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car1 = new Car("BMW");
		Car car2 = new Car("Mercedes");
		
		garage.park(car1);
		garage.park(car2);
		
	}

}
