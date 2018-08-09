package Lab_2;

import java.util.HashMap;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Model m = new Model();
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("--- Ett enkelt cache-minne (2^n) ---");
		
		while(true) {
			System.out.print("Enter number: ");
			input = sc.nextInt();
			if(input == -2) {
				m.clearMemory();
				System.out.println("Memory cleard");
				System.out.println("Program quits");
				System.exit(0);
			} else if(input == -1) {
				m.clearMemory();
				System.out.println("Memory cleard");
			} else{
				try {
					long result = m.compute2Power(input);
					System.out.println("Power of "+ input + " is: " + result);
				} catch (IllegalArgumentException e) {
					System.out.println("Invalid input");
				}
			}
			System.out.println("-----------------------------");
		}

	}
	
}
