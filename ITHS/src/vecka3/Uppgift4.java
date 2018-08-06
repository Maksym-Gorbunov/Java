
public class Uppigft4 {
	
	public static void main(String[] args) {
		int list1[] = {6,10,-5,11,59,4,25,0,-10,7};
		int list2[] = {1,0,1,10,51,-5,-6,2,-11,-100};
		System.out.print("List1 unsorted:");
		printList(list1);
		System.out.println("");
		System.out.print("List2 unsorted:");
		printList(list2);
		System.out.println("");
		System.out.print("List1 ascending order: ");
		printList(bubbelSortAscending(list1.clone()));
		System.out.println("");
		System.out.print("List1 descending order: ");
		printList(bubbelSortDescending(list1.clone()));
		System.out.println("");
		System.out.print("List2 ascending order: ");
		printList(bubbelSortAscending(list2.clone()));
		System.out.println("");
		System.out.print("List2 descending order: ");
		printList(bubbelSortDescending(list2.clone()));
		System.out.println("");
		System.out.println("The number 25 exists in List1: " + findNumber(list1, 25 ));
		System.out.println("The number 64 exists in List1: " + findNumber(list1, 64 ));
		System.out.println("The number -11 exists in List2: " + findNumber(list2, -11 ));
		System.out.println("The number -7 exists in List2: " + findNumber(list2, -7 ));
	
	}
	
	
	 
	
	private static int[] bubbelSortAscending(int[] list){
		boolean swapped = true; 
		while(swapped){	
			swapped = false;
			for(int i=0;i<=list.length-2;i++){
				if(list[i] > list[i+1]){
					//Swap list[i] and list[i+1]
					int temp = list[i+1];
					list[i+1] = list[i];
					list[i] = temp;
					swapped = true;
				}
			}
		}
		return list;
		
	}
	
	private static int[] bubbelSortDescending(int[] list){
		boolean swapped = true; 
		while(swapped){	
			swapped = false;
			for(int i=0;i<=list.length-2;i++){
				if(list[i] < list[i+1]){
					//Swap list[i] and list[i+1]
					int temp = list[i+1];
					list[i+1] = list[i];
					list[i] = temp;
					swapped = true;
				}
			}
		}
		return list;
		
	}
	
	private static boolean findNumber(int[] list, int number){
		for(int i=0;i<=list.length - 1;i++){
			if(list[i] == number){
				return true;
			}
		}
		
		return false;
		
	}	
	private static void printList(int list[]){
		if(list.length > 0){
		System.out.print("[");
		for(int i=0;i<list.length-1;i++){
			System.out.print(list[i]+ ",");
		}
		System.out.print(list[list.length-1] + "]");
		}
		else{
			System.out.println("[]");
		}
	}
	


}
