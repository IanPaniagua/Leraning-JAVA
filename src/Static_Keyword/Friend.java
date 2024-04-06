package Static_Keyword;

public class Friend {

	String name;
	static int numberOftFriends;
	
	Friend(String name)	{
		this.name = name;
		numberOftFriends++;
	}
		//other option is with a method:
	static void DisplayFriends() {
		System.out.println("You have "+numberOftFriends+ " friends.");
	
	
	}
}

