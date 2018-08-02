package vecka2;

public class Person {
	private String name;
	private String surname;
	private int age;
	private House house;
	private Car car;
	
	//constructor
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		if(age>0 && age<=100) {
			this.age = age;
		} else {
			this.age = 20;	
		}
	}
	//constructor
	public Person() {
	}
	
	public Car getCar() {
		return car;
	}
	public House getHouse() {
		return house;
	}
	public void buyHouse(House house) {
		this.house = house;
	}
	public void buyCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// same as constructor, but can't be calld on start(on creating of new instance)
	public void createPerson(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		if(age>0 && age<=100) {
			this.age = age;
		} else {
			this.age = 20;	
		}
	}
	
}
