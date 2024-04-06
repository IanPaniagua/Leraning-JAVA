package Method_overriding;

public class Main_ian {

	public static void main(String[] args) {
		//Klasse Main => Humano() extends => Hombre()
		
		Humano humano1 = new Humano();
		
		humano1.HaceDeporte();
		
		Hombre hombre1 = new Hombre();
		hombre1.HaceDeporte();
	}

}
