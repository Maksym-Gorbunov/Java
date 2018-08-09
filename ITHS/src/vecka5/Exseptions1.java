package vecka5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exseptions1 {

	public static void main(String[] args) {
		boolean a = true;
		int b = 0;
		while(a) {
			System.out.println(a+" is true, while loop");
			if(b == 0) {
				System.out.println(00000);
				b = 1;
				continue;
			} 
			else if(b == 1) {
				System.out.println(11111);
				break;
			}
			System.out.println(33333);
		}
		/*
		try {
			inputNumber();
		} catch (InputMismatchException e) {
			System.out.println("EX..");
		}
		*/
		
		//inputNumber();
		//System.out.println("+++");
		
		//throw new IllegalArgumentException();
	}
	
	private static void inputNumber() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		boolean status = true;
		while(status) {
			System.out.print("Enter number: ");
			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error...");
				input = 0;
				continue;
			}
			System.out.println();
			if(input == 1000) {
				System.out.println("Exit...");
				status = false;
			} else {
				System.out.println("Number is "+input);
			}
		}
		System.out.println("...");
	}
}
