
public class Overloaded_methods {

	public static void main(String[] args) {
		// Overloaded Methods = methods that share the same but have different parameters
//								method name + parameters = method signature

		int x = add(1,2);
		System.out.println(x);
		
		int p = add(1,2,3);
		System.out.println(p);
		
		int w = add(1,2,3,4);
		System.out.println(p);
		
		double db = add(1.1,2.0);
		System.out.println(db);
	}

	static int add (int a, int b) {
		System.out.println("this is overloaded method #1:");
		return a+ b;
	}
	static int add (int a, int b, int c) {
		System.out.println("this is overloaded method #1:");
		return a + b + c;
}
	static int add (int a, int b, int c, int d) {
		System.out.println("this is overloaded method #1:");
		return a + b + c + d;
	}
	//we can use as well another paramether with the same name add()
	static double add (double a, double b) {
	System.out.println("this is overloaded method #4:");
		return a + b ;
	}
}
