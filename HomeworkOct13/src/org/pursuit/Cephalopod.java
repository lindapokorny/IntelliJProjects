package org.pursuit;

public abstract class Cephalopod {
    public void ancestor(){
        System.out.println("I am a"
                + getClass().getSimpleName() + ".  "
                + getClass().getSimpleName() + "descended from Mollusks.");

    }
    public abstract void tentacleCount();

}

