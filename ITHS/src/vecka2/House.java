package vecka2;

public class House {
	private String adress;
	private int plan;
	private float area;
	private int price;
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void createHouse(String adress, int plan, float area, int price) {
		setAdress(adress);
		setPlan(plan);
		setArea(area);
		setPrice(price);
	}
}
