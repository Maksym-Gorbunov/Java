package vecka4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		//1
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("One");
		listA.add("Two");
		listA.add("Three");
		listA.add("Four");
		listA.add("Five");
		
		//2
		printList(listA);
		System.out.println("----------------");
		
		//3
		ArrayList<Integer> listB = new ArrayList<Integer>();
		listB.add(35);
		listB.add(4);
		listB.add(12);
		System.out.println(findNumber(listB, 12));
		System.out.println("----------------");
		
		//4
		HashMap<Integer, String> mapA = new HashMap<Integer, String>();
		mapA.put(178, "David");
		mapA.put(192, "Martin");
		mapA.put(164, "Tim");
		mapA.put(142, "Robert");
		mapA.put(201, "Kim");
		findPersonbyLength(mapA);
	}
	
	private static void printList(ArrayList<String> list) {
		for(String item : list) {
			System.out.println(item);
		}
	}
	
	private static boolean findNumber(ArrayList<Integer> list, Integer number) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) == number) {
				return true;
			}
		}
		return false;
	}
	
	private static void findPersonbyLength(HashMap<Integer, String> map) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(input != 1000) {
			System.out.print("Enter persons length: ");
			input = sc.nextInt();
			String name;
			name = map.get(input);
			if(name != null) {
				System.out.println("Person found: "+ name +" "+ input+"cm");
			} else {
				System.out.println("Person not found");
			}
		}
		System.out.println("Exit...");
	}
}
