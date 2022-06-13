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
        //8. create one escape word that ends the game: exit
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
        System.out.println(name + "! Welcome to the \"Making your avocado toast\" game");

        //prompt user to play
        promptToPlay();

        //loop the game if the user wants to play again
        String playAgain = "y";
        while (playAgain.equalsIgnoreCase("y")) {
            System.out.println("You're at the kitchen and trying to make some avocado toast. Where do you want to go?");
            displayDirectionOptions();

            //prompt user to get a move
            String userNavigation = "";
            userNavigation = getUserNavigation(userNavigation);
            if (userNavigation.equalsIgnoreCase("go north")) {
                System.out.println("You see a fridge. What do you want to do next?");
                
            } else if (userNavigation.equalsIgnoreCase("go south")) {
                System.out.println("You see a fridge. What do you want to do next?");

            } else if (userNavigation.equalsIgnoreCase("go east")) {

            } else {

            }
        }
    }

    public static void displayMoveOptions () {
        System.out.println("Choose one of the moves:");
        System.out.println("SEARCH");
        System.out.println("USE");
        System.out.println("GET");
        System.out.println("WASH");
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

    public static String promptToPlay() {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";
        while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
            System.out.println("Do you want to play the game now? (y/n)");
            userChoice = scanner.nextLine();
        }
        return (userChoice);
    }

    public static String getUserNavigation(String userNavigation) {
        Scanner scanner = new Scanner(System.in);
        while (!userNavigation.equalsIgnoreCase("GO NORTH") && !userNavigation.equalsIgnoreCase("GO SOUTH") && !userNavigation.equalsIgnoreCase("GO EAST") && !userNavigation.equalsIgnoreCase("GO WEST")) {
            System.out.println("Where do you want to go?");
            displayDirectionOptions();
            userNavigation = scanner.nextLine();
        }
        return "";
    }
}
