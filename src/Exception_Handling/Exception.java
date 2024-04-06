package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// Exception = an event that occurs during the execution of a program that, 
		//			disrupts the normal flow of instruction.
		
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole nomber to divide: ");
		int x = scanner.nextInt()	;
		
		System.out.println("Enter a whole nomber to divide by: ");
		int y = scanner.nextInt()	;

		int z= x/y;
		System.out.println("result "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can´t divide by zero! IDIOT!");
		}
		catch(InputMismatchException e) {
			System.out.println("Please ENTER a number !!!");
		
		}
	}

}
