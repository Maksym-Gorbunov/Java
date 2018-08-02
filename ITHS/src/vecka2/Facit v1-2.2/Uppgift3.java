public class ParkingLot {
	String name;
	int carCounter;
	Car[] cars;
	
	public ParkingLot(String name){
		this.name = name;
		cars = new Car[50];
		carCounter = 0;
	}
}
 