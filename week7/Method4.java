public class Method4 {

	public static void main(String[] args) {

		boolean result1 = numberIsLow(76);
		boolean result2 = numberIsLow(156);
		boolean result3 = numberIsLow(1);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
	
	private static boolean numberIsLow(int x) {
		return x<100; 
	}

}
