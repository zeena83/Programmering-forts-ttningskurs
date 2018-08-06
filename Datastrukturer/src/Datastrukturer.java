import java.util.ArrayList;
import java.util.HashMap;

public class Datastrukturer {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list contains the fllowing: "+ list.toString());
		list.add(5);
		list.add(18);
		list.add(-20);
		System.out.println("After add list contains: "+ list.toString());
		list.add(2,-10);
		System.out.println("After adding -10 to index 2 the list contains: "+ list.toString());
		System.out.println("List size is: "+ list.size());
		list.remove(0);
		System.out.println("After removning the first element: "+ list.toString());
		System.out.println("The element in index 2 is: "+ list.get(2) );
		list.clear();
		System.out.println("After clear list contains: "+ list.toString());
		
		HashMap<String, String> phoneBook = new HashMap<String, String>();
		phoneBook.put("0707511157", "Zeena");
		phoneBook.put("00000", "Test");
		System.out.println("The phone book has the follwing entries: "+ phoneBook.toString());
		System.out.println("Numbers of entries in phone book: "+ phoneBook.size());
		System.out.println(phoneBook.get("0707511157") + " has the phone number 0707511157");
		phoneBook.remove("0707511157");
		System.out.println("The phone bokk after removing Zeena looks lik this: "+ phoneBook.toString());
		phoneBook.clear();
		System.out.println("Phone book after clar is: "+ phoneBook.toString());
	}

}
