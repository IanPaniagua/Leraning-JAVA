package Copy_Objects;

public class Car {

	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	//now make,model and year are private. We can´t use it in the main. 
	//because that we create a new method with get+name of the variable, that returns the variable.
	
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	public int getyear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make=make;
		
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void copy(Car x){
		this.setMake(x.getmake());
		this.setModel(x.getmodel());
		this.setYear(x.getyear());}
}


