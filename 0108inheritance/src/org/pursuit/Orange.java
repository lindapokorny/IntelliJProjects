package org.pursuit;

public class Orange extends Fruit {
    public Orange(String name, String color, String flavor, int seedCount) {
        super(name, color, flavor, seedCount);
        //created a new class named java, and we extended (inherited) the Class Fruit
    }
    public void citrusFruit(){
        System.out.println("The " + getName() + " is a citrus fruit.");

    }
}
