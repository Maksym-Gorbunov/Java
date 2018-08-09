package vecka4;

import java.util.ArrayList;
import java.util.HashMap;

public class Datastructure {

	public static void main(String[] args) {
		//////////////	ArrayList	////////////////////
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(0,11);
		list.add(1,55);
		list.add(2,33);
		System.out.println("Size: "+list.size());
		System.out.println("List: "+list.toString());
		list.remove(1);
		System.out.println("List: "+list.toString());
		System.out.println("Element med index 1: "+ list.get(1));
		//list.clear();
		//System.out.println("List clearing: "+list.toString());
		//System.out.println("Size: "+list.size());
		
		
		////////////// HashMap	  ///////////////////////
		System.out.println();
		System.out.println("////////////// HashMap	  ///////////////////////");
		HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
		phoneBook.put("Alex", 12345);
		phoneBook.put("Stan", 78910);
		phoneBook.put("Bill", 11555);
		
		//phoneBook.remove("Bill");
		System.out.println("PhoneBook: "+phoneBook.toString());
		System.out.println("Get value \"Alex\": "+phoneBook.get("Alex"));
		System.out.println("Keys: "+phoneBook.keySet());
		System.out.println("Values: "+phoneBook.values());
		System.out.println("Get name by number: "+phoneBook.get(11555))	;
		System.out.println("-------------------------");
		
		for(String key : phoneBook.keySet()) {
			System.out.println("-"+key+"-");
		}
		System.out.println("-------------------------");
		
		for(Integer value : phoneBook.values()) {
			System.out.println("-"+value+"-");
		}
		
		/*
		int[] test = new int[] {2,3,4,5};
		for(int t : test) {
			System.out.println(t);
		}
		*/
		
		System.out.println("--------- loop HashMap----------------");
		for (HashMap.Entry<String, Integer> entry : phoneBook.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("---"+phoneBook.entrySet());
	}
	
	

}
