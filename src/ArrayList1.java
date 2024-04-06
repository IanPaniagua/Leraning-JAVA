
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList = a resizable array.
		//				Elements can be added and removed after compilation phase
		//				store reference data types

		// we have to use wrapper(Integer)! not primitive(int)
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("hotdog");
		
		//we can replace a value 
		food.add(0,"Sushi");
		//we can remove a value
		food.remove(2);
		//We can clear the list
		food.clear();
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}


	}


