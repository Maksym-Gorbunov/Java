import java.util.Scanner;

public class for111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2st number: ");
		int n2 = sc.nextInt();

		int total = 0;
		for(int i=n1; i<=n2; i++) {
			total += i;
		}
		
		System.out.println("Total: " + total);
	}
}
