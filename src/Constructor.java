
public class Constructor {

	public static void main(String[] args) {
		// constructor = special method that is called when an object is instantiated (created)

		Human_Construction human = new Human_Construction("Rick",65,70);
		Human_Construction human2 = new Human_Construction("Carlos",70,80);
		Human_Construction human3 = new Human_Construction("Tomas",80,100);
		
		System.out.println(human.name + ": " + human.weight);
		System.out.println(human2.name + ": " + human2.weight);
		System.out.println(human3.name + ": " + human3.weight);
		
		human.eat();
		human2.drinks();
		
		
	}

}
