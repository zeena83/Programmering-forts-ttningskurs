
public class Main {

	public static void main(String[] args) {
		
		Elevator e1 = new Elevator();
		//e1.floor = 5;
		e1.setfloor(5);
		
		Elevator e2 = new Elevator();
		//e2.floor = 10;
		e2.setfloor(10);
		
		e1.upAfloor();
		e2.downAfloor();
		
		e1.floor = e2.floor;
		
		boolean b = e1.compareElevator(e2);
		
		System.out.println("F�rsta hissen st�r p� v�nig "+e1.floor);
		System.out.println("Andra hissen st�r p� v�nig "+e2.floor);
		System.out.println("�r hissana p� samma v�ng? "+b);
		
		//add(2, 4);
		//System.out.println(add(2, add(2,3)));
	
	}
	
	//public static int add(int a, int b) {
		
		//int sum = a + b;
		//System.out.println("Resultatet �r " +sum);
		//return sum;
		
	}
	





