package Encapsulation;

public class Main_Encaptulation {

	public static void main(String[] args) {
		//Encaptulation= attributes of a class will be hidden or private,
		//				can be accessed only through methods (getters & setters)
		//				You should make attributes private if you don´t have a reason to make them public or protected

		
		Car car = new Car("Chevrolet","camaro",2021);
		car.setYear(2020);  //we creat a set() because the variable is private, now   we can use it here.
		//doesn´t work because the variable is private
		//System.out.println(car.make);
		
		//this is the way
		System.out.println(car.getmake());
		System.out.println(car.getmodel());
		System.out.println(car.getyear());
	}

}
