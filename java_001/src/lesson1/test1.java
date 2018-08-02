package lesson1;



public class test1 {
	public static int biggest(int a,int b,int c) {
		if(a > b) {
			if(a > c) {
				return a;
			} else {
				return c;
			} 
		} else {
			if(b > c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int biggest = biggest(22,12,7);
		System.out.println(biggest);
	}
}

