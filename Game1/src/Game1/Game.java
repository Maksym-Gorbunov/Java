package Game1;

public class Game {

	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		
		//p1.mp = 500;	not available
		
		for(int i=0; i<4; i++) {
			p1.attack();
			p1.attack();
			p1.attack();
			p1.attack();
			p1.useMpPotion();
		}
	}

}
