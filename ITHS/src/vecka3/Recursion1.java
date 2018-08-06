package vecka3;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTo1(8);
		nFakultet(7);
		System.out.println(factorial(7));
		
		recursion2(0, 10);
	}
	
	private static void printTo1(int i) {
		if(i == 1) {	// basefallet
			System.out.println(i);
		} else {
			//System.out.println("www");
			printTo1(i-1);	// minskar problemet och riktar det mot basefallet
		}
	}
	
	// n-fakultet (n!)	Iteration
	private static void nFakultet(int n) {
		int result = 1;
		for(int i=1; i<=n; i++) {
			result *= i;
		}
		System.out.println(n+"! = "+result);
	}

	// n-fakultet (n!)	Recursion
	private static int factorial(int n) {
		if((n==0) || (n==1)) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
	
	private static void recursion2(int a, int b) {
		if(a == b) {
		} else if(a < b-1) {
			System.out.println(a+1);
			recursion2(a+1, b);
		}
	}
}
