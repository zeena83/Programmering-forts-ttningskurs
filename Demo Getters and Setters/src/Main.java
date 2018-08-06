
public class Main {

	public static void main(String[] args) {
		Clock c = new Clock();
		//c.hours = 5;
		//c.minutes = 10;
		//c.seconds = 20;
		
		//c.setHours(5);
		//c.setMinuters(50);
		//c.setSeconds(45);
		
		c.setTime(0, 0, 0);
		
		while(true) {
			c.tick();
			c.printClock();
		}
		
		//c.setSeconds(85);
		//c.setMinuters(85);
		
		//c.printClock();
		

	}

}
