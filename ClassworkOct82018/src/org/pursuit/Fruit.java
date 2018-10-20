package org.pursuit;

public class Fruit {
try {
        String stringNumber = "1000cats";
        int value = Integer.parseInt(stringNumber);
        System.out.println(value);
    } catch (NumberFormatException e) {
        System.out.println("Not a proper integer value!");
    }
}
