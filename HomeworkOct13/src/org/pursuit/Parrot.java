package org.pursuit;
public class Parrot extends Bird implements Flier {
    private String food;
    private int lifespan;
    private String biome;

    public Parrot(String food, int lifespan, String biome) {
        this.food = food;
        this.lifespan = lifespan;
        this.biome = biome;
    }

    public String getFood() {
        return food;
    }

    public int getLifespan() {
        return lifespan;
    }

    public String getBiome() {
        return biome;
    }

    public void printCharacteristics(){
        System.out.println("I am a Parrot.  I like to eat " + food +
                ".  I live in a " + biome +
                " enviroment.  I can live to be about "
                + lifespan + " years.");
}

    @Override
    public void fly() {
        System.out.println("I am flying using colorful feathers!");
    }
}



