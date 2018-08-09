import java.util.Scanner;


public class Method5 {

	public static void main(String[] args) {

		for (int i=0; i<5; i++) {
			// Call method which returns boolean
			if (isAuthorised()) {
				System.out.println("Congratulations, you got in!");
				// break, since no more tries
				break;
			}
		}
  
	}
	
	private static boolean isAuthorised() {
		Scanner s = new Scanner(System.in);
		System.out.println("Input your three passwords:");
		String answer1 = s.next();
		String answer2 = s.next();
		String answer3 = s.next();

		// Evaluate into boolean, and return directly
		return answer1.equals("piggy") && answer2.equals("snuff") && answer3.equals("bark");
	}

}
