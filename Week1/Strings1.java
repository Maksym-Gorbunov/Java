import java.util.Scanner;

public class Strings1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Vad heter du?");
		String name = s.next();
		System.out.println("Är du man eller kvinna? (man/kvinna)");
		String sex = s.next();
		if (sex.equals("man")) {
			System.out.println("Hej, herr "+name+"!");
		} else if (sex.equals("kvinna")) { 
			System.out.println("Hej, fru "+name+"!");
		} else {
			System.out.println("Invalid output!");
		}
	}
} 