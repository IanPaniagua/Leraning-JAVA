import java.util.ArrayList;
public class For_each_Loop {

	public static void main(String[] args) {
		// for-each=	 traversing technique to iterate throuch the elements in a array/collection
		//				less steps, more readable
		//				less flexible
		
		//Option 1 with Array
		  
		  String[] animals = {"cat", "dog", "rat", "bird"}; 
		  for(String e : animals) {
		  System.out.println("First Option: "+e); } //print all the values of animals
		 
		
		//Option 2 with ArrayList
		
		ArrayList<String> animals2 = new ArrayList<String>();
		
		animals2.add("cat");
		animals2.add("dog");
		animals2.add("rat");
		animals2.add("bird");
		
		for(String i : animals) {
			 System.out.println("Second Option: "+i); }   //print all the values of animals
		
	}

}
