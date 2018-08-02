package maksym;

import java.util.Scanner;
import java.util.ArrayList;

public class my_array {
    public static void main(String[] args){
        System.out.println("Do you want to create the array?");
        System.out.println("Y / N");
        yes_or_no();
    }

    public static void yes_or_no(){
        char sc = in_to_char();

        boolean x = true;
        while (x){
            switch(sc) {
                case 'Y':
                case 'y':
                    System.out.println("OK");
                    x = false;
                    create_array();
                    break;
                case 'N':
                case 'n':
                    System.out.println("Exit...");
                    x = false;
                    break;
                default:
                    input_error();
                    System.out.println("Enter only 'Y' or 'N'");
                    sc = in_to_char();
                    break;
            }
        }


    }

    public static void create_array(){
        System.out.print("Enter array size:\t");
        Scanner in_size = new Scanner(System.in);

        while(!in_size.hasNextInt()){   // check if input has integers
            input_error();
            System.out.print("Enter array size:\t");
            in_size = new Scanner(System.in);
        }
        int size = in_size.nextInt();
        ArrayList<Integer> my_int_array_list = new ArrayList<Integer>(size);

        ///////////////     APPEND TO ARRAY     ///////////////////

        Scanner in_number;
        for(int i = 0; i < size; i++){
            System.out.print("Add number of index " + i + ": ");
            //in_number = new Scanner(System.in);
            //int number = in_number.nextInt();
            int number = input_to_int_check();

            my_int_array_list.add(number);
        }

        System.out.println(my_int_array_list);
    }

    public static void input_error(){
        System.out.println("Incorrect input, try again!");
    }

    public static int input_to_int_check(){
        Scanner reader = new Scanner(System.in);
        while (!reader.hasNextInt()){
            input_error();
            reader = new Scanner(System.in);
        }
        return reader.nextInt();
    }















    public static char in_to_char(){
        Scanner reader = new Scanner(System.in);
        char scannad = reader.next().trim().charAt(0);
        return scannad;
    }
}