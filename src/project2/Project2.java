package project2;

import javax.print.StreamPrintServiceFactory;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

        //Create a 'text based adventure game'
        //Create several action and navigation options for a player to choose from, and a 'help' option
        // that displays all the available choices ( except the secret escape word ).
        //One of the actions should 'wound' the player and if a player is too wounded, they are required to sleep
        // before they can continue.  The only acceptable option for a 'wounded' player is to sleep.
        // After they sleep, they are no longer wounded.
        //Each command will always give the same response to the player regardless of where they are.
        //Add at least 4 'action' commands, at least 4 'navigation' commands like Go North, an option to sleep,
        // an option for help, and a secret escape word that ends the game.
        //If the command isn't recognized, display the help text
        //Count the number of 'turns' the player is in the game for,
        // don't count the help command as a turn and display the # when the game ends/

        //map
       //     bathroom
       // wall=Living room = bedroom
           //     kitchen


        Scanner keyboard = new Scanner(System.in);



        System.out.println("Please enter your name:");
        String name = keyboard.nextLine();

        //basic greet and start the game
        System.out.println("Welcome to \"Find your lost wedding ring\" game!");

        String startTheGameChoice = "";
        while (!startTheGameChoice.equalsIgnoreCase("y") && !startTheGameChoice.equalsIgnoreCase("n")) {
            System.out.println("Do you want to start the game now? (y/n)");
            startTheGameChoice = keyboard.nextLine();
        }


        //get & validate playerActions
        String playerAction ="";
        while (!playerAction.equalsIgnoreCase("GO") && !playerAction.equalsIgnoreCase("PICK") &&
                !playerAction.equalsIgnoreCase("USE") && !playerAction.equalsIgnoreCase("SLEEP")
                && !playerAction.equalsIgnoreCase("HELP")) {
            //prompt the player to move
            System.out.println("You're at the living room now. What do you want to do next?");
            playerAction = keyboard.nextLine();
        }
        if (playerAction.equalsIgnoreCase("go"))

            //display the rules
            displayGameRules(name);

            //display the moves options
            displayMoveOptions();

            //display the direction options
            displayDirectionOptions();

            //wounded action: moves %5 == 0, wounded 1 || PICK UP THE KNIFE || PICK UP THE KETTLE || USE THE BATHTUB
            String wounded = woundedActions(playerAction);

    }

    public static void displayGameRules (String name) {
        System.out.println("Hello player " + name + "!");
        System.out.println("Here are the rules of the game:");
        System.out.println("You're in your own house and your ing is lost. Your house includes a living room, a bathroom, a kitchen and a bedroom. \n" +
                "Move a round the rooms and find your rings.");
        System.out.println("Type \"MOVES\" to display the moving options.");
        System.out.println("Type \"DIRECTIONS\" to display the directions options.");
        System.out.println("Type \"HELP\" to display the game rules again!");
    }

    public static void displayMoveOptions () {
        System.out.println("Choose one of the moves:");
        System.out.println("GO");
        System.out.println("PICK UP");
        System.out.println("USE");
        System.out.println("SLEEP");
        System.out.println("HELP");
    }

    public static void displayDirectionOptions () {
        System.out.println("Choose one of the directions:");
        System.out.println("North");
        System.out.println("West");
        System.out.println("South");
        System.out.println("East");
    }

    public static String woundedActions(String playerAction) {
        Scanner scanner = new Scanner(System.in);
        if (true) {

        }
        return "";
    }

}
