import java.util.Scanner;


public class Method6 {

	public static void main(String[] args) {
		int i = 30; 
		while(i >= 25) { 
			i--;
		System.out.println(i); 

		}
	}
	
	private static boolean isAuthorised() {
		Scanner s = new Scanner(System.in);
		System.out.println("Input your three passwords:");
		String answer1 = s.next();
		String answer2 = s.next();
		String answer3 = s.next();

		if(2!=300) {
			
		}
		
		// Evaluate into boolean, and return directly
		// Note the AND and OR symbols, and parentheses
		return (answer1.equals("piggy") && answer2.equals("snuff") && answer3.equals("bark"))
		    || (answer1.equals("piggy") && answer3.equals("snuff") && answer2.equals("bark"))
		    || (answer2.equals("piggy") && answer1.equals("snuff") && answer3.equals("bark"))
		    || (answer2.equals("piggy") && answer3.equals("snuff") && answer2.equals("bark"))
		    || (answer3.equals("piggy") && answer1.equals("snuff") && answer2.equals("bark"))
		    || (answer3.equals("piggy") && answer2.equals("snuff") && answer1.equals("bark"));
	}

}
