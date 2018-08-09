public class Method3 {

	public static void main(String[] args) {

		int result1 = multiplyByFour(2);
		int result2 = multiplyByFour(6);
		int result3 = multiplyByFour(1);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
	
	private static int multiplyByFour(int x) {
		int result = x * 4; 
		return result;
	}

}
