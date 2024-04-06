import java.util.*;
public class ArrayList2_Dinamic {

	public static void main(String[] args) {
		// 2D ArrayList = a diynamic list of lists
		// You can change the size of these lists during runtime
		
		//array list with what we want to store
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
			
		ArrayList<String>bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");

		ArrayList<String>produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String>drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		//System.out.println(bakeryList.get(0));  (the first element of the list)
		System.out.println(groceryList);
		System.out.println(groceryList.get(0)+": is the first List");
		System.out.println(groceryList.get(0).get(0)+": is the first list the value 0");
	}

}
