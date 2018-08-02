public class Program {

	public static void main(String[] args) {
		Car car1 = new Car("BMW", "Fahad");
		Car car2 = new Car("Volvo", "Kevin");
		Car car3 = new Car("VW", "Anna");
		Car car4 = new Car("Ford", "Mikael");
		Car car5 = new Car("BMW", "Johan");
		
		System.out.println("car2 is a " + car2.getModel() + " and is owned by " + car2.getOwner());
		System.out.println("car4 is a " + car4.getModel() + " and is owned by " + car4.getOwner());
		
		ParkingLot domino = new ParkingLot("Domino");
		domino.addCar(car1);
		domino.addCar(car2);
		domino.addCar(car3);
		domino.addCar(car4);
		domino.addCar(car5);
		
		System.out.println("The number of cars parked in Domino : " + domino.getCarCounter());
		System.out.println("The number of free parking places in Domino : " + domino.getFreeSpaces());
		
	}

}
 