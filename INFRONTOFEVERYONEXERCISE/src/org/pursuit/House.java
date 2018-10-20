package org.pursuit;

public class House {
    private int restroomCount;

    public int getRestroomCount() {
        return restroomCount;
    }

    public void setRestroomCount(int restroomCount) {
        this.restroomCount = restroomCount;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getBedroomCount() {
        return bedroomCount;
    }

    public void setBedroomCount(int bedroomCount) {
        this.bedroomCount = bedroomCount;
    }

    private int squareFootage;
    private int bedroomCount;

    House(){}

    House(int restroomCount, int squareFootage, int bedroomCount){
        this.restroomCount = restroomCount;
        this.squareFootage = squareFootage;
        this.bedroomCount = bedroomCount;
    }


}
