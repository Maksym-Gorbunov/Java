import java.util.ArrayList;

public class Uppgift2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("I");
		list.add("Want");
		list.add("To");
		list.add("Break");
		list.add("Free");
		printList(list);
	}
	
	public static void printList(ArrayList<String> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)); 
		}
	}

}