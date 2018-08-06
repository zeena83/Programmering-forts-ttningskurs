
public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.name = "Elona";
		p.age = 22;
		p.job ="Teacher";
		
		Person p2 = new Person();
		p2.name = "Enanna";
		p2.age = 20;
		p2.job ="Teacher";
		
		p.friend= p2;
		
		Car c = new Car();
		c.year = 1995;
		c.brand = "Volvo";
		
		//c.brand = "Toyota";
		
		
		
		p2.car = c;
		p.car = c;
		
		//p2.car.brand = "Nissan";
		
		
		System.out.println(p.name+ " heter jag");
		System.out.println("Min vän heter "+p.friend.name);
		System.out.println("Min bil är en "+p.car.brand);

	}

}
