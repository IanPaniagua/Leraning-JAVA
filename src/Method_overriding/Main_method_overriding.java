	package Method_overriding;

public class Main_method_overriding {

	public static void main(String[] args) {
		// method overriding = Declaring a method in sub class,
		//					which is already present in parent class.
		//					done so that a child class can give its own implementation

		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.speak();
		dog.speak();
	}

}
