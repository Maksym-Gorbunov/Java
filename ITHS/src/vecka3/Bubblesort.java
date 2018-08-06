package vecka3;

public class Bubblesort {
	public static void main(String[] args) {
		int[] list = {3,1,0,8,5,4,2};
		System.out.print("Unsorted list: ");
		printList(list);
		
		System.out.print("Sorted list:   ");
		int[] sortedList = bubbleSort(list.clone());
		printList(sortedList);
		
		System.out.print("Sorted list 2: ");
		int[] sortedList2 = bubbleSort2(list.clone());
		printList(sortedList2);
	}
	
	private static int[] bubbleSort2(int[] list) {
		boolean swapped;
		do {
			swapped = false;
			for(int i=0; i<list.length-1; i++) {
				if(list[i] < list[i+1]) {
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					swapped = true;
				}
			}
		} while(swapped);
		return list;
	}
	
	private static int[] bubbleSort(int[] list) {
		boolean swapped;
		do {
			swapped = false;
			for(int i=0; i<list.length-1; i++) {
				if(list[i] > list[i+1]) {
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					swapped = true;
				}
			}
		} while(swapped);
		return list;
	}
	
	private static void printList(int[] list) {
		System.out.print("[");
		for(int i=0; i<list.length-1; i++) {
			System.out.print(list[i]+", ");
		}
		System.out.println(list[list.length-1]+"]");
	}
}
