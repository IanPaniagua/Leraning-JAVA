package FileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main_File_writeer {

	public static void main(String[] args) {
		//  
		try {
		FileWriter writer = new FileWriter("poem.txt");
		writer.write("Roses are red \nViolets are blue \nBooty booty ");
		writer.close();
	}
		catch(IOException e) {
		e.printStackTrace();
	}
	}
}
