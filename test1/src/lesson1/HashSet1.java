package lesson1;
// Set same ass ex. arrayList but all values are unique, not repeating

import java.util.*;
public class HashSet1 {
    public static void main(String[] args){
        HashSet<String> my_hash_set = new HashSet<String>();
        my_hash_set.add("Max");
        my_hash_set.add("Max1");
        my_hash_set.add("Max2");
        my_hash_set.add("Max2");    //not error but ignore adding, because "Max2" already exist

        System.out.println(my_hash_set);

        Iterator<String> itr = my_hash_set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
