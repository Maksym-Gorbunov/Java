public class ParkingLot {
	String name;
	int carCounter;
	Car[] cars;
	
	public ParkingLot(String name){
		this.name = name;
		cars = new Car[50];
		carCounter = 0;
	}

	public boolean addCar(Car car){
		if(carCounter >= 50){
			return false;
		}
		else{
			cars[carCounter] = car;
			carCounter = carCounter + 1;
			return true;
		}
	}

	public int getCarCounter(){
		return carCounter;
	}
	
	public int getFreeSpaces(){
		return cars.length - carCounter;
	}
} 