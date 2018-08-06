package vecka3;

public class Uppgift5 {

	public static void main(String[] args) {
		System.out.println("The numbers between 1 and 10 are: ");
		printAllNumbers(1,10);
		
		System.out.println("The numbers between -15 and 0 are: ");
		printAllNumbers(-15,0);
		
		System.out.println("The numbers between 0 and 1 are: ");
		printAllNumbers(0,1);
		
		System.out.println("The numbers between 5 and 5 are: ");
		printAllNumbers(5,5);

	}
	
	public static void printAllNumbers(int lowerBound, int upperBound){
		if(lowerBound == upperBound)
			System.out.println(lowerBound);
		else{
			System.out.println(lowerBound);
			printAllNumbers(lowerBound+1, upperBound);
		}
			
	}
 
}
