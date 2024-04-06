//es solo una parte del methodo. parte del ejercicion Uhr y Uhr_mit_Parameter
public class doppelnull_vor {
	public String toString() {
		return "Es ist " + dopelnull(stunde) + ":"+dopelnull(minute);
	}
	public String dopelnull(int zahl)	{
		if (zahl < 9)
		{
			return "0" +zahl;
			
		}
		else 
		{
			return ""+zahl;
}
