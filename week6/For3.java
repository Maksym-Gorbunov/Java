import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Lower bound of looping:");
		int lower = s.nextInt();
		System.out.println("Upper bound of looping:");
		int upper = s.nextInt(); 

		int sum = 0;
		// Go through all numbers from lower to upper
		for (int i = lower; i <= upper; i++) {
			// Add current number (i) to sum
			sum = sum + i;
		}

		System.out.println(sum);

	}

}
