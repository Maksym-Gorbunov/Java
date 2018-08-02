
public class Main {

	public static void main(String[] args) {
		Person2 p1 = new Person2("Jonas", "Eriksson", 25);
		Person2 p2 = new Person2("David", "Johansson", 50);

		System.out.println("p1 info: ");
		System.out.println("Name: " + p1.getFirstName() + " " + p1.getLastName());
		System.out.println("Age: " + p1.getAge());
		
		p1.setFirstName("Kalle");
		p1.setAge(65);
		p1.setLastName("Isaksson");
		
		System.out.println("p1 info after change: ");
		System.out.println("Name: " + p1.getFirstName() + " " + p1.getLastName());
		System.out.println("Age: " + p1.getAge());
		
		System.out.println("p2 info: ");
		System.out.println("Name: " + p2.getFirstName() + " " + p2.getLastName());
		System.out.println("Age: " + p2.getAge());
		
		p2.setFirstName("Björn");
		p2.setAge(40);
		p2.setLastName("Karlsson");
		
		System.out.println("p2 info after change: ");
		System.out.println("Name: " + p2.getFirstName() + " " + p2.getLastName());
		System.out.println("Age: " + p2.getAge());
		
		System.out.println("Trying to set p1's age to 1000: ");
		p1.setAge(1000);
		System.out.println("p1's age: " + p1.getAge());
		
	}

}
 