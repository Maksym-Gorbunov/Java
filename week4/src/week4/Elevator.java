package week4;

public class Elevator {
	public int floor;
	
	public void upp() {
		floor++;
	}
	
	public boolean compareElevator(Elevator e) {
		return floor == e.floor;
	}
}