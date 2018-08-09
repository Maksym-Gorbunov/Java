package week3;

import java.util.Scanner;

public class demo222 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers?");
		int totalNumbers = sc.nextInt();
		System.out.println("Enter "+totalNumbers+" numbers:");
		
		int[] numbers = new int[totalNumbers];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int choice = 0;
		
		while(choice != 3) {
			System.out.println("Choose operation:");
			System.out.println("1. Add");
			System.out.println("2. Multiply");
			System.out.println("3. Exit");
			choice = sc.nextInt();
			if(choice == 1) {
				int res = addNumbers(numbers);
				System.out.println(res);
			} else if(choice == 2) {
				int res = multiplyNumbers(numbers);
				System.out.println(res);
			}
		}
		
		System.out.println("Goodbye");
	}
	
	static int multiplyNumbers(int a[]) {
		int res = 1;
		for(int i=0; i<a.length; i++) {
			res *= a[i];
		}
		return res;
	}

	static int addNumbers(int a[]) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static void login() {
		String pass = "Robin";
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter Password:");
		} while(!s.nextLine().equals(pass));
	}
}
