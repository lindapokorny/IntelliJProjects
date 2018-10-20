package org.pursuit;

public class Fruit { //made a class named Fruit
    private String name; //and then we gave the class fields
    private String color;
    private String flavor;
    private int seedCount; // made four private fields within our class

    public Fruit(String name, String color, String flavor, int seedCount){ // => Fruit()
        // we made a Constructor named fruit INSIDE OF FRUIT CLASS - and gave it parameters
        this.name = name; // pear
        this.color = color; // green
        this.flavor = flavor; //bittersweet
        this.seedCount = seedCount; // 4 .......//this. = are instances inside of the Constructor

    }

    public void printCharacteristics() {
        //Created a method named printCharacteristics
        System.out.println("I am a "
                + getName() + ". I am "
                + getColor() + ". I am "
                + getFlavor() + ". I have "
                + getSeedCount() + "seeds.");
        //printing "I am a " and the name that we got from the the this instances

    }
//outside of Fruit Constructor, and outside of printCharacteristics method we made setters/getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public void setSeedCount(int seedCount) {
        this.seedCount = seedCount;
    }
}
//we get access to public methods but not private fields when we inherit