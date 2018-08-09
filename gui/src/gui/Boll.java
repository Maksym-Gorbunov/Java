package gui;

public class Boll {
	private int diameter;
	private String color;
	
	public Boll(int d, String c) {
		this.diameter = d;
		this.color = c;
	}
	
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void diameterUpp(int i) {
		this.diameter += i;
	}
}
