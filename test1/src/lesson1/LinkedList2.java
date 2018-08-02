package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        long n = (long) 1E7;    // 1000 0000

        ///////////////////////////    Insert    //////////////////////////////////////
        ArrayList arrayList = new ArrayList();
        long milis = System.currentTimeMillis();
        for (int i=0; i<n; i++)
            arrayList.add(i);
        // time now - time before operation
        System.out.println("Insert arrayList takes: " + (System.currentTimeMillis() - milis));  //  2947

        LinkedList linkedList = new LinkedList();
        milis = System.currentTimeMillis();
        for (int i=0; i<n; i++)
            linkedList.add(i);
        // time now - time before operation
        System.out.println("Insert linkedList takes: " + (System.currentTimeMillis() - milis));  //  6750

        ///////////////////////////    Delete    //////////////////////////////////////
        milis = System.currentTimeMillis();
        arrayList.remove(0);
        System.out.println("Remove arrayList takes: " + (System.currentTimeMillis() - milis));  //  5

        milis = System.currentTimeMillis();
        linkedList.remove(0);
        System.out.println("Remove linkedList takes: " + (System.currentTimeMillis() - milis));  //  0

        ///////////////////////////    Search    //////////////////////////////////////
        milis = System.currentTimeMillis();
        arrayList.get((int)n/2);
        System.out.println("Get arrayList takes: " + (System.currentTimeMillis() - milis));  //  0

        milis = System.currentTimeMillis();
        linkedList.get((int)n/2);
        System.out.println("Get linkedList takes: " + (System.currentTimeMillis() - milis));  //  28


    }
}

