package org.pursuit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {


        private int[] numbers = new int[5];
        /**
         * (5)
         * (5)
         * (5)
         * (5)
         * (5)
         */

        private static Set <Integer> numberSet = new HashSet();

    /**
     *
      *  (5)
     */

    private static Map<String, Integer> studentMap = new HashMap<String, Integer>();

    //HashMap gives you a pair; a key and its value. put keyword is where you put the values in.
    public static void main(String[] args) {

        numberSet.add(Integer.valueOf(5)); // here these are adding values to the numberSet; but it only adds 5, 10 one time because the second time they are not unique values.
        numberSet.add(Integer.valueOf(10));//this one and the one above; adds an element of "5" and "10" to the set.
        numberSet.add(Integer.valueOf(5)); //above mentioned; these two will not change the size of the set
        numberSet.add(Integer.valueOf(10)); // will not change the size of the set

        numberSet.contains(5); // will only return whether this object exists in the set.  Returns true/false
        numberSet.remove(5);// will only retrn whether this object exissts in the set AND was removed.  Returns true/false


        studentMap.put("Rusi", 29); // adds a key value pair of "Rusi" and 29
        studentMap.put("Student2", 19); // adds a key value pair of "Student2" and 19
        studentMap.put("Student", 30); //adds a key value pair of "Student" and 30.

        studentMap.put("Rusi", 10);

        Integer value = (Integer) studentMap.get("Rusi");
    }
}
