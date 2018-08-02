package lesson1;

public class while_loop {
    public static void main(String[] args) {
        int a = 0;
        /*
        while(a <= 5){
            System.out.println(a++);    // postincrement, first print, then a++
        }
        */

        int b = 0;
        // do_while vill loop min 1 loop
        do{
            System.out.println(b++);
        } while(b <= 3);
    }
}

