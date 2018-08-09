package week4;

public class Person {
	public String name;
	public int age;
	public String job;
	public Person friend;
	public Car car;
	
	public void setInfo(String n, int a, String j) {
		name = n;
		age = a;
		job = j;
	}
	
	public void printPerson() {
		System.out.println("My name is "+name);
		System.out.println("I am "+age+" years old");
		System.out.println("My job is "+job);
		System.out.println("My car is " + car.model + " (" + car.year+")");
	}
	
	public void buyCar(String m, int y) {
		car = new Car();
		car.model = m;
		car.year = y;
	}
	
	public void tradeCar(Person p) {
		//Car temp = new Car();
		Car temp;	//	why???????????????????????????????????????????????
		temp = car;
		car = p.car;
		p.car = temp;
	}
}
