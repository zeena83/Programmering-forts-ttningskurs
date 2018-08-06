import java.util.Scanner;

public class Nulling {

	public static void main(String[] args) {
		
		int i = null; // Går inte! Value type. också för char, boolean, double,, men det går för Car. *för alla som börjar med stor bokstav.
		Scanner  s = null; //Finfint! Reference type
		
		/*String s = getUserInput();
		char firstletter = getFirstLetter(s);
		System.out.println("First letter: "+firstletter);*/
		
		
		
		//String s = null;
		//Scanner sc = null;
		//Car c = null;
		
		/*System.out.println("Get length of input");
		String input = getUserInput();
		if (input != null) {
			System.out.println("length: "+input.length());
		}
		else {
			  System.out.println("length: 0hello");
		}
		//System.out.println(input); */

	}
	
	
	public static char getFirstLetter(String s) {
		if (s !=null) {
			return s.charAt(0);
		}
		else {
			return 0;
			
		}
	}
	
	
	
	
	public static String getUserInput() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Du  you want to give input?");
		String response = sc.nextLine();
		if(response.equals("no")) {
			return null;
		}
		else {
			return response;
		}
	}

}
