package RefValueTypes;

public class RefValueTypes {

	public static void main(String[] args) {
		// value types
		int  a = 10;
		intChanger(a);
		System.out.println("a = "+a);
		
		int[] arr = new int[] {5, 15, 45};
		arrayChanger(arr);

	}
	public static void intChanger(int x) {
		x = 25;
		System.out.println("x is "+x);
	}
	public static void arrayChanger(int[] xs) {
		xs[0] = 25;
		for(int i=0; i<xs.length; i++) {
			System.out.println("xs["+i+"] = "+xs[i]);
		}
	}
}
