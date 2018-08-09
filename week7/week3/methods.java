package week3;

import java.util.Scanner;

public class methods {
	public static void main(String[] args) {
		String[] myArray = inputArray(5);
		printArray(myArray);
	}
	
	static void printArray(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	static String[] inputArray(int length) {
		System.out.println("Enter String Array of "+length+" elements:");
		Scanner sc = new Scanner(System.in);
		String[] temp = new String[length];
		for(int i=0; i<length; i++) {
			temp[i] = sc.nextLine();
		}
		return temp;
	}
}
