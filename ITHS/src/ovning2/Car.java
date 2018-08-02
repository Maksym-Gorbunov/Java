package ovning2;

public class Car {
	private Person owner;
	private String model;
	public Car(Person owner, String model) {
		this.owner = owner;
		this.model = model;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
