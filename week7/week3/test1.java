package week3;

public class test1 {
	public static void main(String[] args) {
		String name1 = "Max";
		String name2 = "Tim";
		String name3 = "Joe";
		String name4 = "Kim";
		
		String[] names = new String[4];

		names[0] = name1;
		names[2] = name3;
		names[2] = null;	// set null 
		
		for(int i=0; i<4; i++) {
			System.out.println("Names ["+i+"]: "+names[i]);
		}
		System.out.println("Names length: "+names.length);
		
		int[] array2 = new int[10];
	}
}
