package org.pursuit;

public class Octopus extends Cephalopod implements Swimmer {

    public void printCharacteristics(){
        System.out.println("I am a " + getClass().getSimpleName()
        + ".  We descended from Cephalopod");
    }
    private int tentacleCount;

    public Octopus(int tentacleCount){
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




