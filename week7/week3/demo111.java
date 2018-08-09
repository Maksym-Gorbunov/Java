package week3;

import java.util.Scanner;

public class demo111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		login();
		System.out.println("Enter 2 numbers:");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int choice = 0;
		
		while(choice != 3) {
			System.out.println("Choose operation:");
			System.out.println("1. Add");
			System.out.println("2. Multiply");
			System.out.println("3. Exit");
			choice = sc.nextInt();
			if(choice == 1) {
				int res = addNumbers(number1, number2);
				System.out.println(res);
			} else if(choice == 2) {
				int res = multiplyNumbers(number1, number2);
				System.out.println(res);
			}
		}
		System.out.println("Goodbye");
	}
	
	static int multiplyNumbers(int a, int b) {
		return a*b;
	}

	static int addNumbers(int a, int b) {
		return a+b;
	}
	
	static void login() {
		String pass = "Robin";
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter Password:");
		} while(!s.nextLine().equals(pass));
	}
}
