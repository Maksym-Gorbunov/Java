import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
		System.out.println("   --- Welcome to High-Low Game ---");
		// choosing difficulty level
		int maxNumber = difficulty();
		System.out.println("Guess the number from 1 to " + maxNumber);
		// game process
		int guesses = playGame(maxNumber);
		System.out.print("You guessed my number in " + guesses + " guesses.");
	}
	
	
	// choosing difficulty level
	public static int difficulty() {
		boolean status = false;
		int maxNumber = 0;
		
		while(status == false) {
			System.out.println("Choose difficulty:");
			System.out.println("1. Easy (1-10)");
			System.out.println("2. Medium (1-100)");
			System.out.println("3. Hard (1-1000)");
			Scanner reader = new Scanner(System.in);
			int choice;
			try {
				choice = reader.nextInt();
				switch(choice) {
				case 1: 
					maxNumber = 10;
					status = true;
					break;
				case 2: 
					maxNumber = 100;
					status = true;
					break;
				case 3: 
					maxNumber = 1000;
					status = true;
					break;
				default:
					break;
				} 
			} catch (Exception e) {	// if entered sign not a number
				continue;
			}
		}
		return maxNumber;
	}


	//game processing
	public static int playGame(int maxNumber) {
		// create random number
		int secretNumber = (int)(Math.random() * maxNumber) + 1;
		int totalGuesses = 0;
		// user number
		Scanner reader2 = new Scanner(System.in);
		int userNumber = 0;
		
		do {
			if(reader2.hasNextInt()) {
			    userNumber = reader2.nextInt();
				giveResponse(secretNumber, userNumber);
				totalGuesses++;
			} else {
				// if entered sign not a number
				try {
					userNumber = reader2.nextInt();
				} catch (Exception e) {
					System.out.println("Invalid input! NUMBERS ONLY!");
					reader2.next();
					continue;
				}
			}
		} while (secretNumber != userNumber);
		return totalGuesses;
	}
	
	
	// print out response
	public static void giveResponse(int answer, int guess) {
		if (guess > answer) {
			System.out.println("Your guess is too high.");
		} else if (guess < answer) {
			System.out.println("Your guess is too low.");
		} else {
			System.out.print("Congratulations! ");
		}
	}
}