import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Declare variable for storing input here.
		// Note: we cannot declare it inside the do block below,
		//       since then it wouldn't be visible in the while condition.
		int number;
 
		do {
			System.out.print("Mata in ett tal fr�n 0 till 10: ");
			number = scanner.nextInt();
		} while (number<100);

	}

}
