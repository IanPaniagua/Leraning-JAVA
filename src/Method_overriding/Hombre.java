package Method_overriding;
import java.util.Scanner;
public class Hombre extends Humano {

	void HaceDeporte() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del Hombre: ");
		String name = sc.next();
		
		System.out.println("el Hombre se llama "+name);
	}
}
