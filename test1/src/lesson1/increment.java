package lesson1;

public class increment {
    public static void main(String[] args) {
        int x = 12;
        //x++;      // increment operation

        System.out.println(x);
        System.out.println(++x);    // increment, x+1, after print out
        System.out.println(x++);    // postincrement, print x and after x+1
        System.out.println(x);
    }
}
