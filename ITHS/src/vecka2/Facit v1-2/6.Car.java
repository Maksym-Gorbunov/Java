
public class Car {
	String model;
	int value, kmCounter;
	
	public Car (String model, int value, int kmCounter){
		this.model = model;
		this.value = value;
		this.kmCounter = kmCounter;
	}
	
	public void decreaseValue(){
		value -= 2000;
	}

}
