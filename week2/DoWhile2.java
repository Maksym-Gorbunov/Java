import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		// Infinite loop (until we encounter break)
		while (true) {
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			if (input >= 0 && input < 10) {
				System.out.println("Number is within range!");
				break;
			}
		}
	}
 
}
