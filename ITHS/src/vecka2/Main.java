package vecka2;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.createPerson("John", "Smith", 24);
		
		House h1 = new House();
		h1.createHouse("San Francisco 213", 1, 74.5f, 2600000);
		p1.buyHouse(h1);
		
		Car c1 = new Car();
		c1.createCar("Honda Accord", 2003, 260000);
		p1.buyCar(c1);
		System.out.println(p1.getName()+" "+p1.getSurname()+" is "+p1.getAge()+" years old.");
		System.out.println("Adress: "+p1.getHouse().getAdress()+" "+p1.getHouse().getArea()+"m2 "+p1.getHouse().getPrice()+"$.");
		System.out.println("Car is: "+p1.getCar().getModel()+" ("+p1.getCar().getAge()+" year) "+p1.getCar().getMileage()+"km.");
		
		Person p2 = new Person("Bob", "Jason", 28);
		System.out.println();
		//p2.createPerson("Bob", "Darry", 37);
		p2.buyHouse(h1);
		System.out.println(p2.getName()+" "+p2.getSurname()+" is "+p2.getAge()+" years old.");
		System.out.println("Adress: "+p2.getHouse().getAdress()+" "+p2.getHouse().getArea()+"m2 "+p2.getHouse().getPrice()+"$.");
		
	}

}
