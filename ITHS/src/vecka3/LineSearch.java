package vecka3;

public class LineSearch {
	public static void main(String[] args) {
		int[] list = {2,1,7,4,15,7,32,8,19,5};
		int x = 7;
		lineSearch(x, list);
		
		char[] text = {'a', ' ', 'b', 'c', 'd'};
		charSearch('b', text);
		
		int[] sortedList = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		binarySearch(3, sortedList);
	}

	private static int lineSearch(int x, int[] list) {
		for(int i=0; i<list.length; i++) {
			if(x == list[i]) {
				System.out.println("Element "+x+" found on index "+i);
				return i;
			}
		}
		System.out.println("Element not found");
		return 0;
	}

	private static boolean charSearch(char x, char[] text) {
		for(int i=0; i<text.length; i++) {
			if(x == text[i]) {
				System.out.println("("+x+")"+" is on the "+i+" place");
				return true;
			}
		}
		System.out.println("("+x+")"+" is not found");
		return false;
	}
	
	private static boolean binarySearch(int x, int[] sortedList) {
		boolean status;
		do {
			status = false;
			if(x > sortedList[sortedList.length / 2]) {
				System.out.println("+++");
				return true;
			}
		} while(status);
		System.out.println("---");
		return false;
	}
}	
