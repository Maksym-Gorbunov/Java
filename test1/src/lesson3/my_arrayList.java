package lesson3;

import java.util.ArrayList;

public class my_arrayList {
    public static void main(String[] args){
        int simpleArray[] = {1,2,3,4,5};    // or new int[5]

        // declare arrayList
        //ArrayList<Integer> myList = new ArrayList<Integer>(5);
        ArrayList<Integer> myList = new ArrayList<>(5);

        myList.add(11);
        myList.add(22);
        myList.add(33);
        myList.add(44);

        System.out.println("myList = " + myList); // [11, 22, 33, 44]

        //myList.remove(2);      // delete element with index=2
        //myList.clear();        // delete all values
        //myList.set(0, 555);    // owerwrite 0-index element to value '555'
        //myList.isEmpty();      // check if list is empty, return boolian
        //myList.contains(44);   // check if '44' in myList, return boolian
        //myList.get(2);         // return element with index=2

        //System.out.println(myList);


        System.out.println("myList2 = " + myList);

        for (Integer x: myList){
            System.out.println(x);
        }
        /*  11
            22
            33
            44*/

        System.out.println("Size: " + myList.size());
    }
}
