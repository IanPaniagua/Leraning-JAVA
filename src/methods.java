
public class methods {

	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon

		String name = "Bro";
		int age = 29;
		hello(name,age);  //we introduce the String name in the parentesis because like this we can use it in the method hello()
		hello(name,age);
		hello(name,age);
		
		int x =3;
		int y = 4;
		int z = add(x,y);
		
		System.out.println("the summe is: "+z);
		//another way
		System.out.println(add(x,y));
		
	}
		
	static void hello(String name, int age) { //like this I can use a String from the main in my method.
		System.out.print("Hello " + name +".");
		System.out.println(" You are "+ age);
	}
	
	static int add(int x, int y) {
		
		int z = x +y;
		return z;
		
	}
		
	}


