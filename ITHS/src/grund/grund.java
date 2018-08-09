package grund;

public class grund {
	public static void main(String[] args) {
		System.out.println(recursiveSum(8));
	}
	
	// retur sum of all numbers between -5 and n.
	// recusdiveSum(8) = (-5)+(-4)+(-3)+(-2)+(-1)+0+1+2+3+4+5+    6+7+8 = 21
	public static int recursiveSum(int n){
		 if(n == -5)
			 return -5;
		 else
			 System.out.println(n);
		 return n + recursiveSum(n-1);
	}
}
