package lesson1;

import java.util.Scanner;

public class myClass2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);  // scan is object
        System.out.println("Enter your age: ");
        int age = scan1.nextInt();  // object -> int
        System.out.println("Entered age is: " + age);

        Scanner scan2 = new Scanner(System.in);  // scan is object
        System.out.println("Enter your name: ");
        String name = scan2.nextLine();  // object -> string
        System.out.println("Entered name is: " + name);

    }

}
