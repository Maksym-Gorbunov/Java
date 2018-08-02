package demo111;

import java.util.Scanner;

public class lesson3 {
	public static void main(String[] args) {
		int age = 32;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age>0 && age < 25) {
			System.out.println("You are yong");
		} else if(age>=25 && age<50) {
			System.out.println("You are middle age");
		} else if(age>=50 && age<100) {
			System.out.println("You are old");
		} else if(age>=100) {
			System.out.println("You are turtle");
		} else {
			System.out.println("Wrong input!");
		}
	}
}
