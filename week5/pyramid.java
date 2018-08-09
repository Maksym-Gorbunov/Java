import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		System.out.println("Enter the pyramid high:");
		Scanner sc = new Scanner(System.in);
		int height;
		
		do {
			height = sc.nextInt();
			
			if(height < 1) {
				System.out.println("Too low");
			} else if(height > 20) {
				System.out.println("Too high");
			}
		} while (height < 1 || height > 20);
		
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
