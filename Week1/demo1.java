
public class demo1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		
		if(a < b) {
			System.out.println("A");
			int c = 10;	// var c die inside of block
			a = a + c;
		}
		int c = 3;		// initialize new var with the same name, because previous already erased from the memory
		
		System.out.println("B");
		System.out.println(a);
	}
}
