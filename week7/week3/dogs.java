package week3;
import java.util.Scanner;
public class dogs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength;
		
		System.out.println("How many dogs do you have?");
		arrayLength = sc.nextInt();
		sc.nextLine();	// bug in Scanner
		String[] dogs = new String[arrayLength];
	
		System.out.println("Enter names of your " + arrayLength + " dogs:");
		for(int i = 0; i<arrayLength; i++) {
			dogs[i] = sc.nextLine();
		}
		
		System.out.println("DOGS:");
		for(int i = 0; i<arrayLength; i++) {
			System.out.println(dogs[i]);
		}
	
	}
}
