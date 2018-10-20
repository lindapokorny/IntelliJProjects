package org.pursuit;

public class Main {

    public static void main(String[] args) {

        System.out.println("The crust is " + Pie.getCrust());
        System.out.println("The filling is " + Pie.getPieFilling());
        System.out.println("The diameter is " + Pie.getDiameter());

        Pie cherryPie = new Pie();

        System.out.println("The crust is " + cherryPie.getCrust());
        System.out.println("The filling is " + cherryPie.getPieFilling());
        System.out.println("The diameter is " + cherryPie.getDiameter());

        System.out.println(Pie.getPieFilling());

        Pie cherryPie2 = new Pie();
        Pie cherryPie3 = new Pie();

        Pie rhubarbPie = new Pie("graham cracker","rhubarb",24);

        System.out.println(cherryPie.getPieFilling());
        System.out.println(cherryPie2.getPieFilling());
        System.out.println(cherryPie3.getPieFilling());
//        Pie.getPieFilling() = "rhubarb";
//        System.out.println(Pie.pieFilling);
//        System.out.println(cherryPie.pieFilling);
//
//        cherryPie.pieFilling = "blackberry";
//        System.out.println(Pie.pieFilling);
//
//        Pie cherryPie2 = new Pie();
//        System.out.println(cherryPie2.pieFilling);
        }
}
