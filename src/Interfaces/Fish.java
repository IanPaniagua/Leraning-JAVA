package Interfaces;

public class Fish implements Prey,Predator {

	public void hunt() {
		System.out.println("This fish is huntin smaller fish");
		
	}

	public void flee() {
		System.out.println("This fish is flaein fom a larger fish");
		
	}

	
	//Interfaces= a template can be applied a class.
	//			similar to inheritance, but specifies what a class has/must do.
	//			classes can apply more than one interface, inheritance is limited to 1 super
}
