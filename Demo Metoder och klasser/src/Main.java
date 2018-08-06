
public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setInformation("Elona", 22 , "Teacher");
		p.buyCar("Volovo", 1992);
		
		Person p2 = new Person();
		p2.setInformation("Enanna", 22, "Teacher");
		p2.buyCar("Saab", 1999);
		//p.age = 55;
		//System.out.println("name: "+p.name+", age: "+p.age+", job: "+p.job );
		
		p.printPerson();
		p2.printPerson();
		
		p.tradeCar(p2);
		
		p.printPerson();
		p2.printPerson();
		
	}
	
}
