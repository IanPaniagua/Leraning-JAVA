import java.util.Random;
public class Randomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random = new Random();
	int x = random.nextInt(6)+1;
	System.out.println(x);
	
	double y = random.nextDouble(9.0);
	System.out.println(y);
	
	boolean b = random.nextBoolean();
	System.out.println(b);
	
	}

}
