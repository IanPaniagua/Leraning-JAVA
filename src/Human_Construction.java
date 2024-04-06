
public class Human_Construction {

	String name;
	int age;
	double weight;
	
	Human_Construction(String name,int age,double weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void drinks() {
		System.out.println(this.name+" is drinking *burp*");
	}
	void eat() {
		System.out.println(this.name+"is eating");
	}
}
