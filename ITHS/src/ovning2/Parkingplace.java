package ovning2;

public class Parkingplace {
	private String name;
	private int counter;
	private Car[] places;
	
	public Parkingplace(String name) {
		this.name = name;
		places = new Car[50];
		counter = 0;
	}
	public boolean addCar(Car c) {
		if(counter < places.length) {
			places[counter] = c;
			counter++;
			System.out.println("Parking success on the "+counter+" place.");
			return true;
		} else {
			System.out.println("Sorry, not enouth space in parkingplace.");
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public Car getCarByIndex(int index) {
		return places[index];
	}
	public int freePlaces() {
		System.out.println("Free places: "+(places.length - counter));
		return places.length - counter;
	}
}

