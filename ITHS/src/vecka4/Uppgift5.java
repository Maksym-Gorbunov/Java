import java.util.HashMap;
import java.util.Scanner;

public class Uppgift5 {

	public static void main(String[] args) {
		HashMap<Integer, String> table = new HashMap<Integer, String>();
		table.put(176, "Fahad");
		table.put(182, "John");
		table.put(187, "Gavin");
		table.put(196, "David");
		table.put(165, "Michael");
		Scanner in = new Scanner(System.in);
		int input;
		do{
			System.out.println("Enter the height of the person you are looking for: ");
			input = in.nextInt();
			String name;
			name = table.get(input);
			if(name == null){
				System.out.println("No person in the table with that height");
			}
			else{
				System.out.println(name);
			}
			
		}while(input != 1000); 
		in.close();
	}

}
