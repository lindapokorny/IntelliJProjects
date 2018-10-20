package org.pursuit;

public class Fellow {
    private String name;
    private char grade;
    private double cohort;

    Fellow(){}
    Fellow(String name, char grade, double cohort){
        this.cohort = cohort;
        this.grade = grade;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getCohort() {
        return cohort;
    }

    public void setCohort(double cohort) {
        this.cohort = cohort;
    }

}
