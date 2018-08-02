package lesson1;

// Try Catch Blocks
// catch only first error, only 1 exception
// ArithmeticException... but general Exception on the last place(last catch)

public class Exception1 {
    public static void main(String[] args){
        int b[] = new int[2];

        try{
            System.out.println(b[4]);
            int a = 100/0;  // result continious, error : / by 0

        } catch(ArithmeticException e){
            System.out.println("My Exsepton kan be handled here.");
            System.out.println("EXCEPTION: " + e);
        } catch(Exception e_general){
            System.out.println("EXCEPTION: " + e_general);
        }

        System.out.println("----------    Success      -----------------------");


    }
}
