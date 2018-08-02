package lesson1;

public class for_loop {
    public static void main(String[] args) {
        int a = 10;
        ///int i;
        // for(init; expression; increment)
        for(int i=0; i<=5; i++){
            System.out.println(a);
            a++;
        }

        int[] my_int_array = {11,22,33,44,55,66};
        System.out.println("Array length is " + my_int_array.length);

        for(int item: my_int_array){    // same as foreach in php
            System.out.println(item);
        }

    }
}
