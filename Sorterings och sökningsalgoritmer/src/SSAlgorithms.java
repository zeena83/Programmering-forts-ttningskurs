import java.util.Collections;


public class SSAlgorithms {

	public static void main(String[] args) {
		int list[] = {2,5,1,9,0,10,11,3,4,7};
		System.out.println("Unsorted list");
		printList(list);
		System.out.println("");
		System.out.println("Sorted list");
		printList(bubbleSort(list.clone()));
		char[] charList = {'a', 'd', 'f'};
		System.out.println("");
		System.out.println("Element (a) exist in charList:"+ findElement(charList, 'a'));
		System.out.println("Element (y) exist in charList:"+ findElement(charList, 'y'));

	}
	
	private static int [] bubbleSort(int[] list) {
		boolean swapped = true;
		while(swapped) {
			
			swapped = false;
		
		for(int i = 0; i <= list.length-2; i++) {
			if(list[i] > list[i+1]) {
				// Swap list[i] and list[i + 1]
				int temp = list[i+1];
				list[i+1] = list[i];
				list[i] = temp;
				swapped = true;
			}
		}
		
	}
		return list;
		
		
	}
	
	private static boolean findElement(char[] list, char element) {
		for ( int i = 0; i <= list.length - 1; i++ ) {
			if(list[i] == element) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
	
	private static void printList(int list[]) {
		if(list.length > 0) {
			System.out.print("[");
			for(int i = 0; i < list.length-1; i++) {
				System.out.print(list[i] + ",");
			}
			System.out.print(list[list.length-1] + "]");
		}
		else {
				System.out.println("[]");
		}
	}

}
