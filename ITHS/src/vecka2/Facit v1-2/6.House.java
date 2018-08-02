public class House {
	int area, numberOfFloors, value, constructionYear;
	String address;
	Car car;
	public House(int area, int numberOfFloors, int value, int constructionYear, String address){
		this.area = area;
		this.numberOfFloors = numberOfFloors;
		this.value = value;
		this.constructionYear = constructionYear;
		this.address = address;
	}
	public void increaseValue(){
		value += 1000;
	}

}
 