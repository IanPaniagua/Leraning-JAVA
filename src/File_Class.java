import java.io.File;

public class File_Class {

	public static void main(String[] args) {
		// file = An abstract representation of file and directory pathnames
		
		File file = new File("Secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists! :o!");
			System.out.println(file.getPath());				//name of the file
			System.out.println(file.getAbsolutePath());		//location of the file
			System.out.println(file.isFile());
			
			
		}
		else {
			System.out.println("That file doesn´t exist :(");
		}

	}

}
