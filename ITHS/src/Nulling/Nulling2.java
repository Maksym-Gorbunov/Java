package Nulling;

public class Nulling2 {

	public static void main(String[] args) {
		String n = null;
		try {
			if(n==null) {
				System.out.println(999);
			}
		} catch (Exception e) {
			System.out.println(000);
		}

	}

}
