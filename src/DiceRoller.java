import java.util.Random;

public class DiceRoller {
  //This is LOCAL
	DiceRoller(){
		Random random = new Random();
		int number = 0;
		roll(random,number);
		
	}
	
	void roll(Random random,int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
	/*this is GLOBAL
	 * we can do it outside the method = global
	 * 
	 * public class DiceRoller {
	 * 
	 * Random random;
	 * int number;
	
	
	DiceRoller(){
		
		random = new Random()
		roll(random,number);
		
	}
	
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	 */
	
}
