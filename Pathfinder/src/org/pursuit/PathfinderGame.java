package org.pursuit;

import java.util.Scanner;

public class PathfinderGame implements Game{


    Scanner scanner = new Scanner(System.in);
    int tile;
    int roll;

    public void startGame() {
        logo();
        instructions();
        tile = 1;
        System.out.println("Tile: " + tile);
        checkValue();
        gameOverMaybe();

    }

    private void instructions() {
    }

    private void logo() {
        System.out.println("" +
                "######                      #######\n" +
                "#     #   ##   ##### #    # #       # #    # #####  ###### #####\n" +
                "#     #  #  #    #   #    # #       # ##   # #    # #      #    #\n" +
                "######  #    #   #   ###### #####   # # #  # #    # #####  #    #\n" +
                "#       ######   #   #    # #       # #  # # #    # #      #####\n" +
                "#       #    #   #   #    # #       # #   ## #    # #      #   #\n" +
                "#       #    #   #   #    # #       # #    # #####  ###### #    #\n");

        private void instructions () {
            System.out.println("Instructions:\n " +
                    "This game is called 'PathFinder'. The goal of this game is to reach the end of the path, 100 tiles.\n" +
                    "You start at the first tile, then press enter to roll.\n" +
                    "You can roll any number from 1 to 10 - then move that number of tiles forward.\n" +
                    "If you roll a 7, you get to move 7 tiles, plus a random roll between 1 an 10.\n" +
                    "If you roll a 10, you move back a random roll from between 1 and 10.\n" +
                    "If the random roll is greater than your current tile, you move back to the first tile.\n" +
                    "Good luck!\n"
            );
        }

        private void input () {
            System.out.println("\nPress enter to roll!");
            scanner.nextLine();
            roll = roll();
        }

        private int roll () {

            int random = (int) Math.ceil(Math.random() * 10);

            return random;
        }

        private void checkValue () {
            System.out.println("You rolled a " + roll + "!");
            do {
                System.out.println("Current tile: " + tile);

                System.out.println("Tiles to go: " + (100 - tile));
                input();
                int newRoll = roll();
                if (roll == 7) {
                    System.out.println("Great luck! You rolled a 7! Move forward, plus " + newRoll + "extra spaces!");
                    tile = tile + roll + roll();
                } else if (roll == 10) {
                    System.out.println("Oh no! You've rolled a 10! Move back " + newRoll + "spaces!");
                    if (tile <= 10 && newRoll >= tile) {
                        tile = 1;
                    } else {
                        tile = tile - newRoll;
                    }
                } else {
                    System.out.println("You've rolled a " + roll);
                    tile = tile + roll;
                    System.out.println("New Value: " + tile);
                }
            } while (tile < 100);
            System.out.println("Congrats! You reached the end of the path!");
        }
        private void gameOverMaybe () {
            System.out.print("Play again [Y/n]: ");
            do {
                input = scanner.nextLine();
                if (input.length() == 0 || input.charAt(0) == 'Y' || (input.charAt(0) == 'y')) {
                    startGame();
                } else if (input.charAt(0) == 'n' || (input.charAt(0) == 'N')) {
                    System.out.println("Goodbye! Thanks for playing PathFinder!");
                    break;
                } else {
                    System.out.println("Sorry, does not compute...");
                }
            }
            while (input.length() != 0
                    || input.charAt(0) != 'Y'
                    || (input.charAt(0) != 'y')
                    || input.charAt(0) == 'n'
                    || (input.charAt(0) == 'N'));
        }
    }
}