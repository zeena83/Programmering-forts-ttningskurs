
public class Game {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		Player p2 = new Player();
		//p1.mpPotions = 500;
		//p1.mp = 5000000;
		//p1.hp = 6000000;
		
			for (int i = 0; i < 5; i++) {
			p1.attack();
			p1.attack();
			p1.attack();
			p1.attack();
			p1.useMpPotion();
			p1.attack();
		}
	}

}































































































































