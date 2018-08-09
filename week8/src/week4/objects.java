package week4;

public class objects {

	public static void main(String[] args) {
		dog d1 = new dog();
		dog d2 = new dog();
		d1.name = "Rik";
		d1.age = 12;
		//System.out.println(d1.age);
		
		Elevator e1 = new Elevator();
		e1.floor = 2;
		
		Elevator e2 = new Elevator();
		e2.floor = 2;
		
		boolean b = 4==5;
		
		System.out.println("Elevator is on the "+e1.floor+" floor");
		//e1.upp();
		//e1.upp();
		//e1.upp();
		//e1.upp();
		System.out.println("Elevator is on the "+e1.floor+" floor");
		System.out.println(b);
		
		System.out.println("Compare Elevator: " + e1.compareElevator(e2));
	}

}
