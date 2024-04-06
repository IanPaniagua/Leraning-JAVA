package Method_overriding;

import java.util.Scanner;

public class Humano {

	void HaceDeporte() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name Eingeben");
		String name = sc.next();
		System.out.println(name+" hace deporte");
		
		
	}
}
