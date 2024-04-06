
public class SwapTwoVariables {

	public static void main(String[] args) {
		// Swap two Variables (intercambio)
		
		String x = "water";
		String y = "limonada";
		String temp;  // you can create a new variable to save a value temporally
		//now you can´t save x in y because they are voll. (you need to empty)
		temp = x ; // now the content of X is in the variable Temp, so x now is empty
		x = y;		//because that you can save the content of y in x.
		y = temp; //now you can save the content of empty (that is X) in y
		
		//like these you have change the content between 2 variables. (swap)
		
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		

	}

}
