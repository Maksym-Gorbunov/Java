package week4;

public class Main {

	public static void main(String[] args) {
		/*
		Person p = new Person();
		Person p2 = new Person();
		p.name = "Maksym";
		p.age = 32;
		p.job = "Engineer programmer";
		p.friend = p2;
		
		p2.name = "Dan";
		p2.age = 12;
		p2.job = "Teacher";
		p2.friend = p;
		
		Car c = new Car();
		c.year = 2000;
		c.model = "Peugeot 406";
		
		p.car = c;
		//c.year = 1980;
		p2.car = c;
		//p2.car.model = "Nissan";
		
		System.out.println("My name is "+p.name+".");
		System.out.println("I am "+p.age+" years old.");
		System.out.println("I am "+p.job+".");
		System.out.println("My friend is "+p.friend.name);
		System.out.println(p.car.model+" ("+p.car.year+")");
		*/

		///////// DEMO2  ///////////
		
		Person p3 = new Person();
		Person p4 = new Person();
		p3.setInfo("Daniel", 2, "son");
		p4.setInfo("Tim", 24, "teacher");
		p3.buyCar("Volvo", 1985);
		p4.buyCar("Saab", 1999);
		
		p3.tradeCar(p4);	// byta bilar
		
		p3.printPerson();
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		p4.printPerson();
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

		
	}
}

