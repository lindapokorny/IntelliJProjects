package org.pursuit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = "42";
        String input = "";

        System.out.println("How many skittles are in the jar?");
        scanner.nextLine();

        while (!input.equals(number)) { // While the numbers don't match repeat this code
            System.out.println("Wrong number, try again!");


            input = scanner.nextLine();

            if (input.equals(number)) {
                System.out.println("You entered 42!");
                break;
            }

        }
    }
}
