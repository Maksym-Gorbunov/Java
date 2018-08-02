
public class Week46 {

	public static void main(String[] args) {
	
		Person p1 = new Person("Johan", "Student", "Male", 180, 21 );
		Person p2 = new Person("Anna", "Lawyer", "Female", 170, 28 );
		Person p3 = new Person("Mikael", "Engineer", "Male", 176, 25 );
		
		House h1 = new House(150, 3, 3000000, 2005, "fifth aventue");
		House h2 = new House(100, 2, 1500000, 2010, "Alm street");
		
		p1.home = h1;
		p2.home = h2;
		p3.home = h1;
		
		Car c1 = new Car("BMW", 300000, 1000);
		Car c2 = new Car("Volvo", 50000, 4000);
		
		h1.car = c1;
		h2.car = c2;
		
		System.out.println(p1.name + " lives in " + p1.home.address + " and drives a " + p1.home.car.model);
		System.out.println(p2.name + " lives in " + p2.home.address + " and drives a " + p2.home.car.model);
		System.out.println(p3.name + " lives in " + p3.home.address + " and drives a " + p3.home.car.model);
				
	}
}
 