package vecka5;

import java.util.ArrayList;

public class Uppgift1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("I");
		list.add("Want");
		list.add("To");
		list.add("Break");
		list.add("Free");
		try{
		printList(null);
		}
		catch(NullPointerException e){
			System.out.println("Something serious happened. System will exit now");
			System.exit(1);
		}
		System.out.println("Finish");
	}
	
	public static void printList(ArrayList<String> list){
		if(list == null){
			throw new NullPointerException();
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
