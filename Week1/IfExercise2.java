import java.io.BufferedInputStream;
import java.util.Scanner;


public class IfExercise2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Mata in din po�ng: ");
		int score = scanner.nextInt();

		if (score >= 50) {
			System.out.println("Godk�nt!");
		} else { 
			System.out.println("Underk�nt.");
		}
		
	} 

}
