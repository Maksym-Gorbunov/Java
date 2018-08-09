package vecka5;

import java.util.ArrayList;

public class exercises5 {
	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();
		printList(listA);
		listA.add("Max");
		listA.add("Tommy");
		printList(listA);

		ArrayList<String> listB = null;
		try {
			printList(listB);
		} catch (NullPointerException e) {
			System.out.println("**** fixed ****" + e);
		}
		
		// Errorsearching
		int[] numberList1 = null; // tom lista
		int[] numberList2 = {2, 5, 10, -5, 10};
		
		try {
			System.out.println("50 exists in numbersList1: " + searchNumber(numberList1, 50)); //Borde returnera false
			
		} catch (NullPointerException e) {
			System.out.println( "///// fixed /////" + e);
		}
		System.out.println("-5 exists in numbersList2: " + searchNumber(numberList2, -5)); //Borde returnera true

		
		
		
		
		
		
		System.out.println("Finish");
	}
	
	private static void printList(ArrayList<String> list) {
		//////	??????	///////		
		if(list == null) {	
			throw new NullPointerException();
		}
		if(list.isEmpty()) {
			System.out.println("List is empty");
		}
		for(String item : list) {
			System.out.println(item);
		}
	}

	private static boolean searchNumber(int[] list, int number){
		for(int i=0;i<list.length;i++){
			if (list[i] == number)
				return true;
		}
		return false;
	}
}
