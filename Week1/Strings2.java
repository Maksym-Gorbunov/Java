import java.util.Scanner;

public class Strings2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		String sex = s.next();
		if (sex.equals("man")) {
			System.out.println("Hej, herr "+name+"!");
		} else if (sex.equals("kvinna")) {
			String married = s.next();
			if (married.equals("ja")) {
				System.out.println("Hej, fru "+name+"!");
			} else if (married.equals("nej")) {
				System.out.println("Hej, fröken "+name+"!"); 
			} else {
				System.out.println("Invalid output!");
			}
			
		} else {
			System.out.println("Invalid output!");
		}
	}
} 