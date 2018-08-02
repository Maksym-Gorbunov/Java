import java.util.Scanner;

public class test111 {
	public static void main(String[] args) {
		int i = 45;
		double d = 3.4;
		char c = 'f';	//only '', not "", only 1 character
		String s = "maxxx";
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println();
		
		
		//input
		/*
		Scanner sc = new Scanner(System.in);
		String scString = sc.nextLine();	//input -> String
		System.out.println(scString);
		*/
		
		
		//minicalculator
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt(),
			number2 = sc.nextInt();
		 
		System.out.println(number1 + " + " + number2 + " = " + number1 + number2);	// 3 + 5 = 35
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2)); // 3 + 5 = 8
		
	}
}
