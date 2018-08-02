
public class Main {

	public static void main(String[] args) {
		Position p = new Position();
		p.setX(3);
		p.setY(7);
		
		p.setPosition(-10, 20);
		
		System.out.println("("+p.getX()+";"+p.getY()+")");
	}

}
