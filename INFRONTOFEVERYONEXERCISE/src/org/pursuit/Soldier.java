package org.pursuit;

public class Soldier {
    public static String name = "Roald Dahl";
    public static String rank = "Flying Pilot";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Soldier.name = name;
    }

    public static String getRank() {
        return rank;
    }

    public static void setRank(String rank) {
        Soldier.rank = rank;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public static void setSerialNumber(int serialNumber) {
        Soldier.serialNumber = serialNumber;
    }

    public static int serialNumber = 8675309;

}
