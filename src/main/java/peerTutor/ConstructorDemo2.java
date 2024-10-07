package peerTutor;

public class ConstructorDemo2 {
	//Step 1: Class  variables/attributes
	
	public String name;
	public String lastName;
	public int id;
	public double salary;
	public double bonus;
	
	//step 2 create constructor heading
	//Making parameters with what you know when object is created
	public ConstructorDemo2(String name,String lastName,int id,double salary) {
		//this is used to show ownership of the attributes by the object
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.salary = salary;
		this.bonus = 0;//set to 0 by default but can be set later
				
	}
	
    //setters used to set the amount..to collect information and set it
	public void setBonus(double bonus) {
		this.bonus = bonus;
		//Class variable bonus = parameter bonus that would be gotten	
	}
	//Getters give information
	
	public double getBonus() {
		return this.bonus;
	}
	   
}
