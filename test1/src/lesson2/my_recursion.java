package lesson2;

//////////////////////////    RECURSION    ////////////////////////////
// Recursion - running method from itself (looping method before its done)

public class my_recursion {
    public static void main(String[] args){
        int fact = factorial(5);
        System.out.println(fact);
    }

    public static int factorial(int N){
        if (N <= 1){
            return 1;
        }else {
            System.out.println(N);
            return N * factorial(N-1);
        }
    }

    public static int new_factorial(int number){
        if (number <= 1){
            return 1;
        } else {
            int total = 1;
            for(int i=number; i>=1; i--){
                total *= i;
            }
            return total;
        }
    }
}
