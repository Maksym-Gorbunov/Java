package lesson1;

public class array {
    public static void main(String[] args) {
        int[] my_int_array = {11,22,33,44,55,66};
        /*
        int[] my_int_array = new int[3];
        int[] my_int_array = {1,2,3};
        int[] my_int_array = new int[]{1,2,3};
        */
        int index = 0;
        while(index <= 5){
            System.out.println(my_int_array[index]);
            index++;
        }
    }
}
