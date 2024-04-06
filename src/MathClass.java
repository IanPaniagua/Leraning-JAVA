
public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y);  //the longer of this 2 values
		System.out.println(z);
		
		double m = Math.min(x, y);  //the less of this values
		System.out.println(m);
		
		double a = Math.abs(y);  //display the absolute value
		System.out.println(a+ " absolute value");
		
		double r = Math.round(x); //redondear
		System.out.println(r);
		
		double c = Math.ceil(x);  //redondea arriba
		System.out.println(c);
		
		double f = Math.floor(x);  //redondea abajo
		System.out.println(f);
	}

}
