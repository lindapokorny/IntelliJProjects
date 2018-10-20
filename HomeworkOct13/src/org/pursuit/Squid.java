package org.pursuit;

public class Squid extends Cephalopod implements Swimmer{

    public void printCharacteristics(){
        System.out.println("I am a " + getClass().getSimpleName()
                + ".  We descended from Cephalopods");
    }

    private int tentacleCount;

    public Squid(int tentacleCount) {
        this.tentacleCount = tentacleCount;
    }

    public int getTentacleCount() {
        return tentacleCount;

    }

    @Override
    public void tentacleCount() {

    }

    @Override
    public void swim() {

    }
}
