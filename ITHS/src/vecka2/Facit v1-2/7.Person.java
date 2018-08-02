
public class Person {
	private String firstName, lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	
	public void setAge(int newAge){
		if(newAge>= 0 && newAge <= 100)
			age = newAge;
		else
			age = 20;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setFirstName(String newFirstName){
		firstName = newFirstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String newLastName){
		lastName = newLastName;
	}
	
	public String getLastName(){
		return lastName;
	}
}
 