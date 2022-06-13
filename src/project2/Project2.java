package project2;

import javax.print.StreamPrintServiceFactory;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

        //requirements:
        //1. create actions, at least 4: search the fridge, use the oven, wash the dishes, get the knife, use the stove
        //2. create directions, at least 4: go north, south, east, west of the kitchen
        //3. create option to sleep: wounded %3 == 0, go to sleep.
        //4. create help option to display all the available choices except the escape word: directions + actions except "use the stove"
        //5. display help option when command is not recognized.
        //6. create one wounding action: use the stove
        //7. each command will always give the same response to the player regardless of where they are.
        //8. create one escape word that ends the game: done toasting
        //9. count the turns except for "help" and display the # of turns at the end.

        //brainstorming: right moves =3. make avocado toast: SEARCH the CUPBOARD(bread). SEARCH the FRIDGE(avocado).
        //-----SEARCH the DISHWASHER(plate). USE the OVEN to toast the avocado toast(bake).
        //distractions: SEARCH the SINK = dirty plates, SEARCH the TRASHCAN = stink, SEARCH the STOVE=slightly burned=sleep.

        //choices:north: FRIDGE (search) {avocado, bread slices, ready to toast), OVEN (use) to toast the avocado toast.
        //-----south: DISHWASHER (wash) the {dishes}, (get) the {knife}
        //-----east: STOVE (use) {get burned,wounded; wounded %3 ==0, go to sleep}
        //-----west: KITCHEN TABLE (nothing)

        //get the user's name and greet
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = keyboard.nextLine();
        System.out.println("Hello " +name + "! Welcome to the \"Making your avocado toast\" game!");

        //loop the game if the user wants to play again
        String playAgain = "y";
        while (playAgain.equalsIgnoreCase("y")) {
            System.out.println("You're at the kitchen and trying to make some avocado toast.");

            //prompt for an action;
            String userAction = "";
            while (true) {
                userAction = getUserAction(userAction);
                displayDirectionOptions();

                if (userAction.equalsIgnoreCase("go north")) {
                    System.out.println("You saw a fridge and an oven.");
                    reactToAction(userAction);

                } else if (userAction.equalsIgnoreCase("go south")) {
                    System.out.println("You saw a dishwasher with dirty dishes and a clean knife.");
                    reactToAction(userAction);

                } else if (userAction.equalsIgnoreCase("go east")) {
                    System.out.println("You saw a stove.");
                    reactToAction(userAction);

                } else {
                    System.out.println("You saw a table. There is nothing to do with it.");
                    reactToAction(userAction);
                }
                if (!userAction.equalsIgnoreCase("USE THE OVEN")) {
                    continue;
                }
            }

            System.out.println("Do you want to play again? (y/n)");
            playAgain = keyboard.nextLine();
        }
        System.out.println("Thank you for play the game!");
    }

    public static void displayMoveOptions () {
        System.out.println("Choose one of the moves:");
        System.out.println("SEARCH THE FRIDGE");
        System.out.println("USE THE OVEN");
        System.out.println("WASH THE DISHES");
        System.out.println("GET THE KNIFE");
        System.out.println("USE THE STOVE");
        System.out.println("SLEEP");
        System.out.println("HELP");
    }

    public static void displayDirectionOptions () {
        System.out.println("Choose one of the directions:");
        System.out.println("GO NORTH");
        System.out.println("GO WEST");
        System.out.println("GO SOUTH");
        System.out.println("GO EAST");
    }

    public static String getUserAction(String userAction) {
        Scanner scanner = new Scanner(System.in);
        while (!userAction.equalsIgnoreCase("SEARCH THE FRIDGE") && !userAction.equalsIgnoreCase("USE THE OVEN")
                && !userAction.equalsIgnoreCase("WASH THE DISHES") && !userAction.equalsIgnoreCase("GET THE KNIFE")
                && !userAction.equalsIgnoreCase("USE THE STOVE") && !userAction.equalsIgnoreCase("SLEEP")
                && !userAction.equalsIgnoreCase("HELP")
                && !userAction.equalsIgnoreCase("GO NORTH") && !userAction.equalsIgnoreCase("GO SOUTH")
                && !userAction.equalsIgnoreCase("GO WEST") && !userAction.equalsIgnoreCase("GO EAST")) {
            System.out.println("What do you want to do next?");
            userAction = scanner.nextLine();
        }
        return userAction;

    }

    public static void reactToAction(String userAction) {
        if (userAction.equalsIgnoreCase("search the fridge")) {
            System.out.println("You found some slices of avocado and a couple slices of bread!");

        } else if (userAction.equalsIgnoreCase("use the oven")) {
            System.out.println("You put the avocado and slices of bread in the fridge to the oven, turned the oven on and toasted the avocado toast!");
            System.out.println("Say \"YAY\" to congratulate yourself!");

        } else if (userAction.equalsIgnoreCase("wash the dishes")) {
            System.out.println("You washed the dishes and splashed the water all over the place!");

        } else if (userAction.equalsIgnoreCase("get the knife")) {
            System.out.println("You were so clumsy that you cut your finger with the knife and have to go put first aid on!");

        } else {
            System.out.println("You turned on the stove but there is no gas! Ah~ You forgot that it's a electric one, but unfortunately" +
                    ", it broke anyway.");

        }
        System.out.println("What do you want to do next?");

    }

    public static String getUserToMoveAgain(String moveAgain, String userNavigation) {
        Scanner scanner = new Scanner(System.in);
        //prompt to move again
        while (moveAgain.equalsIgnoreCase("y")) {
            userNavigation = getUserNavigation(userNavigation);
            System.out.println("Do you want to move to anywhere else? (y/n)");
            moveAgain = scanner.nextLine();
        }
        return moveAgain;
    }
}
