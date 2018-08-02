package lesson3;
import java.util.Scanner;
public class input_check {
    public static void main(String[] args){
        Scanner sc;
        boolean i = true;
        while(i){
            sc = new Scanner(System.in);
            try {
                int s = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Wrong input, try again");
                i = false;
            }
        }



    }
}
