package vecka2;

public class Car {
	private String model;
	private int age;
	private int mileage;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public void createCar(String model, int age, int mileage) {
		setModel(model);
		setAge(age);
		setMileage(mileage);
	}
}
