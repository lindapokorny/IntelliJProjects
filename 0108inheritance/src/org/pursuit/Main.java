package org.pursuit;

public class Main {
    public static void main(String[] args){
        Fruit fruit = new Fruit("Pear", "green", "bittersweet", 4);
        fruit.printCharacteristics();

        Apple apple = new Apple("apple", "red", "sweet", 8);
        apple.printCharacteristics();

        Orange orange = new Orange("orange", "orange", "acidid sweet", 8);
        orange.printCharacteristics();
        orange.citrusFruit();
        // calling constructors from Orange class (which is extended (inherited) from the Fruit Class)
        //new is the keyword you use to create an object. followed by constructor - in this case it's orange

        Peach peach = new Peach("Peach", "yellow", "sweet", 1);
        peach.printCharacteristics();
    }
}
