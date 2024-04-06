package Static_Keyword;

public class Static_Keyword {

	public static void main(String[] args) {
// Static = modifier. A single copy of a variable/method is created and shared.
		//				The class "owns" the static member.
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Ernesto");
		Friend friend3 = new Friend("Benito");
		
		enemy enemy1 = new enemy("Ramos");
		enemy enemy2 = new enemy("Serrano");
		
		System.out.println("number of friends: "+Friend.numberOftFriends);
		System.out.println("number of enemy: "+enemy.numberOfEnemy);
	
	//other option with method:
		Friend.DisplayFriends();
	}

}
