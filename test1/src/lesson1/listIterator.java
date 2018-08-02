package lesson1;
import java.util.*;
/*
hasNext()
next()
hasPrevious()
previous()
 */
public class listIterator {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("John");
        names.add("Patrik");
        names.add("Billy");
        names.add("Bob");

        ListIterator<String> iter = names.listIterator();
        /*while(iter.hasNext())
            System.out.println(iter.next());*/
        while (iter.hasPrevious())
            System.out.println(iter.previous());
    }
}
