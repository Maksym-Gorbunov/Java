
public class Person {
	String name, profession, gender;
	int height, age;
	House home;
	
	public Person(String name, String profession, String gender, int height, int age){
		this.name = name;
		this.profession = profession;
		this.gender = gender;
		this.height = height;
		this.age = age;
	}
	
	public void increaseAge(){
		age += 1;
	}
}
 