
public class Player {
	
	// ph, mp, mana potions och hp potions
	public int hp = 100;            //private
	public int mp = 100;            //private
	public int mpPotions = 3;       //private
	public int hpPotions = 3;       //private
	
	// död eller inte?
	public boolean isDead = false;
	
	//attackera (vilket ta MP)
	public void attack() {
		if(!isDead) {
			if (mp >= 25) {
				mp -= 25;
				System.out.println("Attacking!");
			}else {
				System.out.println("Not enough MP :(");
			}
		}else {
			System.out.println("Your dead, silly");
		}
	}
	
	// ta skada (vilket tar Hp)
	public void takeDamage() {
		hp -= 25;
		if (hp <= 0) {
			System.out.println("You died!");
			isDead = true;
		}else {
			System.out.println("You took damage! ");
		}
	}
	
	// Refill player life
	public void useHpPotion() {
		if(hpPotions > 0) {
			System.out.println("You drank a hp potion");
			hpPotions--,
			hp += 100;
		}else {
			System.out.println("Not enough hp potion");
		}
	}
	
	// Refill player mana
		public void useMpPotion() {
			if(mpPotions > 0) {
				System.out.println("You drank a mp potion");
				mpPotions--;
				mp += 100;
			}else {
				System.out.println("Not enough mp potion");
			}
		}

}
