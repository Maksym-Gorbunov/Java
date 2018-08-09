package vecka4;
import java.util.Scanner;
public class Aktiviteringdiagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input;
		do {
			System.out.print("Enter number: ");
			input = in.nextInt();
			/*
			if(input == -1) {
				continue;
			}
			*/
			method(input);
		} while(input != -1);
		System.out.println("stop");
	}
	
	private static void method(int a) {
		System.out.println(a);
	}

}
