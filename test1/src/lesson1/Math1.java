package lesson1;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        int x, y, result;
        x = 20;
        y = 30;
        //  + - * / %
        result = x + y;
        System.out.println(x + " + " + y + " = " + result);
        //System.out.println(x+y);  // + work as + not as concatenation(join)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = scan.nextFloat();
        System.out.println("Enter b: ");
        float b = scan.nextFloat();
        float total = a + b;
        System.out.println(a + " + " + b + " = " + total);
    }
}
