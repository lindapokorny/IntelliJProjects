package org.pursuit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            integerList.add(i);
            System.out.println(integerList.get(i));

        }


        String[] stringArray = {"Hello", ",", " "};
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}


//        int[] numberArray = {42, 21, 33, 98, 76}; // declared our variable of int Array
//        System.out.println("Length of Array: " + numberArray.length);
//        System.out.println(numberArray[0]);
//
//        int[] numberArray02 = new int[5];
//
//
//
//        System.out.println("Length of numberArray02: " + numberArray02.length);
//
//        for (int i = 0; i < numberArray02.length; i++) {
//            System.out.println(numberArray02[i]); // this will print out the array
////
//        }
//
//        for (int i = 0; i < numberArray02.length; i++) {
//            numberArray02[i] = (i * 7);
//
//        }
//
//
//            ArrayList<Integer> numList = new ArrayList<>();
//
//            System.out.println(numList.size());
//
//////            numList.add(1);
//////            for (int i = 0; i < numList.size() ; i++) {
////
////            }
////
////            System.out.println(numList.get(0));
////
////            numList.add(3);
////
////            System.out.println(numList.get(1));
////
////            numList.remove(1);
////
////            System.out.println(numList.get(1));
//
//        }
////        for (int i = numberArray.length -1; i >= 0 ; i--) {
////            System.out.println(numberArray[i]); //this will print out the array backwards
//
//        Object[] objects = new Object[10];
//    }
////        System.out.println(numberArray[0]);
////        System.out.println(numberArray[1]);
//
//
//}
//
////imutable = cant change size
////mutable = size can change;
