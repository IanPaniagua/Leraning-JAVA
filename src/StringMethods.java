
public class StringMethods {

	public static void main(String[] args) {
		// String = a reference data type that can store one or more charachters
		// reference data types have access to useful methods
		
		String name = "Bro";
		
		//boolean result = name.equals("Bro");
		//boolean result = name.equals("bro");
		//boolean result = name.equalsIgnoreCase("bro"); //ignore the case "B"
		//int result = name.length();  //(3)
		//char result = name.charAt(0); //( la posicion "0" en Bro es "B"
		//int result = name.indexOf("o"); //position of the letter (2)
		//boolean result = name.isEmpty(); //name ist empty? (false)
		//String result = name.toUpperCase(); //all Uper case (BRO)
		//String result = name.toLowerCase(); //all lower case (bro)
		//String result = name.trim(); //to remove empty space
		String result = name.replace('o', 'a'); //reemplazar (Bra)
		System.out.println(result);

	}

}
