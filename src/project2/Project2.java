package project2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

       Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name + "! Welcome to \"Make your avocado toast\" game");

        String playGameChoice = "y";
        while (playGameChoice.equalsIgnoreCase("y")) {

            int count = 0;
            int wound = 0;
            String action ="";
            while (!action.equalsIgnoreCase("GET MY TOAST")) {

                //get and validate user action
                while (!action.equalsIgnoreCase("SEARCH THE FRIDGE") && !action.equalsIgnoreCase("USE THE OVEN") &&
                        !action.equalsIgnoreCase("WASH THE DISHES") && !action.equalsIgnoreCase("PICK UP THE KNIFE") &&
                        !action.equalsIgnoreCase("TURN ON THE STOVE") && !action.equalsIgnoreCase("SEARCH THE TABLE") &&
                        !action.equalsIgnoreCase("SLEEP") && !action.equalsIgnoreCase("HELP") &&
                        !action.equalsIgnoreCase("GO NORTH") && !action.equalsIgnoreCase("GO SOUTH") &&
                        !action.equalsIgnoreCase("GO EAST") && !action.equalsIgnoreCase("GO WEST") &&
                        !action.equalsIgnoreCase("GET MY TOAST")) {
                    System.out.println("What do you want to do next?");
                    action = keyboard.nextLine();
                }

                if (action.equalsIgnoreCase("HELP")) {
                    System.out.println("Here are all available moves:");
                    System.out.println("GO NORTH");
                    System.out.println("GO SOUTH");
                    System.out.println("GO EAST");
                    System.out.println("GO WEST");
                    System.out.println("SEARCH THE FRIDGE");
                    System.out.println("USE THE OVEN");
                    System.out.println("WASH THE DISHES");
                    System.out.println("PICK UP THE KNIFE");
                    System.out.println("TURN ON THE STOVE");
                    System.out.println("SEARCH THE TABLE");
                    System.out.println("SLEEP");
                    System.out.println("HELP");

                } else if (wound != 0 && wound % 3 == 0 && !action.equalsIgnoreCase("SLEEP")) {
                    System.out.println("You need to SLEEP.");
                    continue;

                } else if (action.equalsIgnoreCase("GET MY TOAST")) {

                } else if (action.equalsIgnoreCase("GO NORTH")) {

                } else if (action.equalsIgnoreCase("GO SOUTH")) {

                } else if (action.equalsIgnoreCase("GO EAST")) {

                } else if (action.equalsIgnoreCase("GO WEST")) {

                } else if (action.equalsIgnoreCase("SEARCH THE FRIDGE")) {

                } else if (action.equalsIgnoreCase("USE THE OVEN")) {

                } else if (action.equalsIgnoreCase("WASH THE DISHES")) {

                } else if (action.equalsIgnoreCase("PICK UP THE KNIFE")) {

                } else if (action.equalsIgnoreCase("TURN ON THE STOVE")) {

                } else if (action.equalsIgnoreCase("SEARCH THE TABLE")) {

                } else if (action.equalsIgnoreCase("SLEEP")) {

                } else {

                }
            }

            System.out.println("Do you want to play again? (y/n)");
            playGameChoice = keyboard.nextLine();
        }

    }
}
