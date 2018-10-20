package org.pursuit;

public class Main {

    public static void main(String[] args) {
        MethodType methodType = new MethodType();
        System.out.println(MethodType.getFirst()); // this should work
        System.out.println(MethodType.getSecond()); // this should cause an error
        System.out.println(methodType.getFirst()); // this should work
        System.out.println(methodType.getSecond()); // this should work as well
    }


}

