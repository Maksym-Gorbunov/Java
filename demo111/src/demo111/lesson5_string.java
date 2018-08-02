package demo111;

import java.util.Scanner;

public class lesson5_string {
	public static void main(String[] args) {
		/*
		System.out.println("Hello. Who are you?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();	//next() or nextLine()
		System.out.println("Hello " + name);
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
		*/
		
		Scanner s = new Scanner(System.in);
		String password = s.nextLine();
		if(password.equals("Bob")) {			// .equals() same as == but for Strings
			System.out.println("Welcome " + password);
		}
	
	}
}
