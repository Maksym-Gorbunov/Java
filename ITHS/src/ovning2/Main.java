package ovning2;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Max");
		Car c1 = new Car(p1, "Honda");
		Parkingplace p = new Parkingplace("Nordstan");
		
		p.addCar(c1);
		p.addCar(c1);
		p.addCar(c1);
	
		
		System.out.println("The number of cars parked in "+p.getName()+": " + p.getCounter());
		System.out.println(p.getCarByIndex(0).getModel());
		p.freePlaces();
	}

}
