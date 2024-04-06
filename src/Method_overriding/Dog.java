package Method_overriding;

public class Dog extends Animal{
							//@override to specificate that it is an overriding method
	@Override  				//Take not, that you don´t need to write "//".
	void speak() {
		//System.out.println("The dog goes *bark*");
	}
}
//if we remove this method. It´s gone use the closed method, so the speak() in the klasse Animal.