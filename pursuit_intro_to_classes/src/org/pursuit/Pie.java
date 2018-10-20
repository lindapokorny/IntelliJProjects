package org.pursuit;

public class Pie {


    private String crust;
    private String pieFilling;
    private int diameter;

    Pie() {
        this( "filo dough" , "cherry", "12");
    }

    Pie(String newCrust, String newPieFilling, String newDiameter);

    public String getCrust() {

        return crust;
    }

    public String getPieFilling() {

        return pieFilling;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {

        return diameter;
    }
    public void setCrust(String newCrust) {
        crust = newCrust;
    }

    public void setPieFilling(String pieFilling) {
        this.pieFilling = pieFilling;
    }

    public void pieIsBaked() {
        System.out.println("I am a " + pieFilling + " pie!");

    }
}
