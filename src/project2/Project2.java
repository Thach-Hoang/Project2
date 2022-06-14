package project2;

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
        //distractions: SEARCH the SINK = dirty plates, SEARCH the TRASHCAN = stink, SEARCH the STOVE=nothing.

        //choices:north: FRIDGE (search) {avocado, bread slices, ready to toast), OVEN (use) to toast the avocado toast.
        //-----south: DISHWASHER (wash) the {dishes}, (get) the {knife} wounded; wounded %3 ==0, go to sleep}
        //-----east: STOVE (use) {nothing},
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

            //declare and initialize wounds, turns, userAction
            int wounds = 0;
            int turns = 0;
            String userAction = "";

            //ask for the next move
            String nextMove = "y";
            while (nextMove.equalsIgnoreCase("y")) {

                //prompt for an action and validate input
                userAction = getValidUserAction(userAction);

                reactToUserAction(userAction, "GO NORTH", "There is a fridge and an oven in front of you now.");

                reactToUserAction(userAction, "GO NORTH", "There is a fridge and an oven in front of you now.");
                reactToUserAction(userAction, "GO SOUTH", "There is a dishwasher with a dirty knife and dirty plates in front of you.");
                reactToUserAction(userAction, "GO EAST", "There is a stove in front of you.");
                reactToUserAction(userAction, "GO WEST", "There is a kitchen table in front of you.");

                reactToUserAction(userAction, "SEARCH THE FRIDGE", "You found some avocado and a loaf of bread.");
                reactToUserAction(userAction, "USE THE OVEN", "You used the ingredients from the beside fridge to make an avocado toast!\n" +
                        "Congratulation! You made your toast! Type GET MY TOAST to finish the game.");

                reactToUserAction(userAction, "WASH THE DISHES", "You cleaned the dishes but splash the water all over the place.");
                reactToUserAction(userAction, "PICK UP THE KNIFE", "Ouch! You cut yourself and got some fist aid on.");

                reactToUserAction(userAction, "USE THE STOVE", "You couldn't turn on the stove. What was wrong with you? Ah~ stove have been broken already.");

                reactToUserAction(userAction, "SEARCH THE TABLE", "There were nothing. It's just a plain table.");

                //prompt to the next move
                if (userAction.equalsIgnoreCase("GET MY TOAST")) {
                    break;
                } else {
                    System.out.println("Continue? (y/n)");
                    nextMove = keyboard.nextLine();
                }
            }
            //prompt to play again
            System.out.println("Do you want to play again? (y/n)");
            playAgain = keyboard.nextLine();
        }
        System.out.println("Thank you for play the game!");
    }

    public static void displayMoveOptions () {
        System.out.println("SEARCH THE FRIDGE");
        System.out.println("USE THE OVEN");
        System.out.println("WASH THE DISHES");
        System.out.println("PICK UP THE KNIFE");
        System.out.println("USE THE STOVE");
        System.out.println("SLEEP");
        System.out.println("HELP");
    }

    public static void displayDirectionOptions () {
        System.out.println("GO NORTH");
        System.out.println("GO WEST");
        System.out.println("GO SOUTH");
        System.out.println("GO EAST");
    }

    public static String getValidUserAction(String userAction) {
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

    public static String reactToUserAction(String userAction, String moves, String prompt) {
        Scanner scanner = new Scanner(System.in);
        if (userAction.equalsIgnoreCase(moves)) {
            System.out.println(prompt);
        } else {
            System.out.println();
        }
    }
}
