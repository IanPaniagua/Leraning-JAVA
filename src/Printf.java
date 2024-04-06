
public class Printf {

	public static void main(String[] args) {
		//printf() = an optimal method to control, format, and display text to the console window
		//			two arguments = format string + (object/variable/value)
//					% [flags][precision]width][conversion-character]

		System.out.printf("This is a format string %d",123);	// 123 is represented by %d
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Ian";
		int myInt = 50;
		double myDouble = 1000;
		
		//[conversion-character]
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble);
		
		//[width]
		// minimum number of characters to be written as output
		System.out.printf("\n Hello %10s",myString);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("\n Double with only two decimals %.2f",myDouble);
		System.out.println();
		System.out.printf("0%d",myInt);
		//[flags]
		// adds an effect to output based on the flag added to format specifier
		/*
		 *  - :	left-justify
		 *  + :	output a plus ( + ) or minus ( - ) sign for a numeric value
		 *  0 : numeric values are zero-padded
		 *  , : comma grouping separator if numbers > 1000
		 */
	}

}
