package lesson1;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> names = new <String>LinkedList();

        names.add("Maksym");
        names.add("Bob");
        String first = "first";
        names.addFirst(first);
        names.addLast("last");
        //names.remove(2);           // delete by index
        //names.remove("first");     // delete by value
        names.add(1, "index_one");  // add to index 1

        names.set(1, "index_one_new");


        System.out.println(names);
        //names.clear();               // delete all values
        System.out.println(names.size());

        for (String n : names){
            System.out.println("..." + n);
        }

    /*    int i=0;
        while(i<5)
            System.out.println(i++);
    */
    }
}
