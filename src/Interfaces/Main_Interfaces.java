package Interfaces;

public class Main_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rabbit rabbit = new Rabbit();
		
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		
		hawk.hunt();
		
		Fish fish = new Fish();
		
		fish.hunt();
		fish.flee();
	}

}
