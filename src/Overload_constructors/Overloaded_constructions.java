package Overload_constructors;

public class Overloaded_constructions {

	public static void main(String[] args) {
		
//Overloaded constructors= multiple constructors within a class with the same name,
//							but have different parameters
//							name + parameters = signature
		
		Pizza pizza = new Pizza("thicc crust","tomato","mozarella","peperoni");				//pizza = object

	System.out.println("Here are the ingredients of your pizza: ");
	System.out.println(pizza.bread);
	System.out.println(pizza.sauce);
	System.out.println(pizza.cheese);
	System.out.println(pizza.topping);
	}
}
