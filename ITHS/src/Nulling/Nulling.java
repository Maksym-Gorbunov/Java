package Nulling;

import java.util.Scanner;

public class Nulling {

	public static void main(String[] args) {
		//String s = null;
		//Scanner sc = null;
		//Car a = null;
		
		System.out.println(getFirstLetter("Hey"));
		
		String input = getInput();
		System.out.println(input);
		
		if(input != null) {
			System.out.println("Input length is "+input.length());
		} else {
			System.out.println("Input length is 0");
		}
	}
	public static char getFirstLetter(String s) {
		if(s != null) {
			return s.charAt(0);	// get char on index 0 from string s
		} else {
			return 4;
		}
	}
	
	public static String getInput() {
		System.out.println("Do you want to do input?");
		Scanner sc = new Scanner(System.in);
		String responce = sc.nextLine();
		if(responce.equals("no")) {
			return null;
		} else {
			return responce;
		}
	}

}
