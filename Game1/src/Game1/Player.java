package Game1;

public class Player {
	private int hp = 100;	//health poing	
	private int mp = 100;	//mana pooing
	private int hpPotions = 3;	//restore hp
	private int mpPotions = 3;	//restore mp
	private boolean isDead = false;
	
	// attacking which take mana
	public void attack() {
		if (!isDead) {
			if(mp>=25) {
				mp-=25;
				System.out.println("Attack!");
			} else {
				System.out.println("Not enouth mana :(");
			}
		}
	}
	
	// take damage
	public void takeDamage() {
		hp-=25;
		if(hp<=0) {
			System.out.println("You died!");
			isDead = true;
		} else {
			System.out.println("You took damage");
		}
	}
	
	// restore health, refill player life
	public void useHpPotion() {
		if(hpPotions>0) {
			System.out.println("You drank a hp potion");
			hpPotions--;
			hp+=100;
		} else {
			System.out.println("Not enouth hp potion :(");
		}
	}

	// restore mana, refill player mana
	public void useMpPotion() {
		if(mpPotions>0) {
			System.out.println("You drank a mp potion");
			mpPotions--;
			mp+=100;
		} else {
		System.out.println("Not enouth mp potion :(");
		}
	}
}
