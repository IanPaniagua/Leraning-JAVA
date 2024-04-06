
public class Array2D {

	public static void main(String[] args) {
		// 2D array = an array of array
		
		/*
		 * String [][] cars = new String [3][3];
		 * 
		 * cars [0][0] = "camaro"; cars [0][1] = "corvette"; cars [0][2] = "Silverado";
		 * cars [1][0] = "Mustang"; cars [1][1] = "Ranger"; cars [1][2] = "F-150"; cars
		 * [2][0] = "Renault"; cars [2][1] = "BMW"; cars [2][2] = "MB";
		 */
		String[][] cars = 
			{
				{"camaro", "corvette", "Silverado"},
				{"Mustang", "mercedes", "ijdfis"},
				{"ksakf", "lksdlfka", "lksdlfkna"}
			};
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]+"");
			}
		}

	}

}
