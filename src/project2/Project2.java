package project2;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

       Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name + "! Welcome to \"Make your avocado toast\" game!");

        System.out.println("Do you want to start the game now, " + name + "? (y/n)");
        String gameStart = keyboard.nextLine();
        while (gameStart.equalsIgnoreCase("y")) {
            String playGameChoice = "y";
            while (playGameChoice.equalsIgnoreCase("y")) {
                //game intro
                System.out.println("You're at a kitchen trying to make your avocado toast.");
                System.out.println("There are things around you. Go search and figure out how to make your own toast!");
                System.out.println("Type HELP to display all available MOVES.");
                int count = 0;
                int wound = 0;
                String action = "";

                //while action is not escape, run; otherwise, end loop.
                while (!action.equalsIgnoreCase("GET MY TOAST")) {
                    action = "";
                    //get and validate user action including escape
                    while (!action.equalsIgnoreCase("SLEEP") && !action.equalsIgnoreCase("HELP") &&
                            !action.equalsIgnoreCase("GET MY TOAST") &&
                            !action.equalsIgnoreCase("GO NORTH") && !action.equalsIgnoreCase("GO SOUTH") &&
                            !action.equalsIgnoreCase("GO EAST") && !action.equalsIgnoreCase("GO WEST") &&
                            !action.equalsIgnoreCase("SEARCH THE FRIDGE") && !action.equalsIgnoreCase("USE THE OVEN") &&
                            !action.equalsIgnoreCase("WASH THE DISHES") && !action.equalsIgnoreCase("PICK UP THE KNIFE") &&
                            !action.equalsIgnoreCase("TURN ON THE STOVE") && !action.equalsIgnoreCase("SEARCH THE TABLE")) {
                        System.out.println("What do you want to do next?");
                        action = keyboard.nextLine();
                        //show HELP when action is not recognizable
                        if (!action.equalsIgnoreCase("SLEEP") && !action.equalsIgnoreCase("HELP") &&
                                !action.equalsIgnoreCase("GET MY TOAST") &&
                                !action.equalsIgnoreCase("GO NORTH") && !action.equalsIgnoreCase("GO SOUTH") &&
                                !action.equalsIgnoreCase("GO EAST") && !action.equalsIgnoreCase("GO WEST") &&
                                !action.equalsIgnoreCase("SEARCH THE FRIDGE") && !action.equalsIgnoreCase("USE THE OVEN") &&
                                !action.equalsIgnoreCase("WASH THE DISHES") && !action.equalsIgnoreCase("PICK UP THE KNIFE") &&
                                !action.equalsIgnoreCase("TURN ON THE STOVE") && !action.equalsIgnoreCase("SEARCH THE TABLE")) {
                            System.out.println("Here are all available moves:");
                            System.out.println("SLEEP");
                            System.out.println("HELP");
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
                        }

                    }
                    //prompt to sleep when wounded, no count
                    if (wound != 0 && wound % 3 == 0 && !action.equalsIgnoreCase("SLEEP")) {
                        System.out.println("You're still sick. Take a rest. You need to SLEEP!");
                        //help, no count
                    } else if (action.equalsIgnoreCase("HELP")) {
                        System.out.println("Here are all available moves:");
                        System.out.println("SLEEP");
                        System.out.println("HELP");
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
                        //GET MY TOAST=escape, no count
                    } else if (action.equalsIgnoreCase("GET MY TOAST")) {
                        System.out.println("Yay! Congratulation, " + name + "! You have made your toast and finished the game!");
                        //the rest of actions count++
                    } else if (action.equalsIgnoreCase("GO NORTH")) {
                        count++;
                        System.out.println("You saw a fridge and an oven.");
                    } else if (action.equalsIgnoreCase("GO SOUTH")) {
                        count++;
                        System.out.println("You saw a dishwasher with dirty plates and a dirty knife");
                    } else if (action.equalsIgnoreCase("GO EAST")) {
                        count++;
                        System.out.println("You saw a stove");
                    } else if (action.equalsIgnoreCase("GO WEST")) {
                        count++;
                        System.out.println("You saw a plain table.");
                    } else if (action.equalsIgnoreCase("SEARCH THE FRIDGE")) {
                        count++;
                        System.out.println("You found some avocado and some slices of bread");
                    } else if (action.equalsIgnoreCase("USE THE OVEN")) {
                        count++;
                        System.out.println("You used the ingredients from the beside fridge and made an avocado toast!");
                        System.out.println("Type GET MY TOAST to get your toast out of the oven and finish the game");
                    } else if (action.equalsIgnoreCase("WASH THE DISHES")) {
                        count++;
                        System.out.println("You washed the dishes, but splashed the water all over the place.");
                    } else if (action.equalsIgnoreCase("PICK UP THE KNIFE")) {
                        count++;
                        wound++;
                        System.out.println("You cut yourself with the knife. Luckily, there is some bandage to put on, but it hurt still.");
                        if (wound % 3 == 0 && wound != 0) {
                            System.out.println("You got infected. You had some pills but still feel no power to do anything. Go SLEEP!");
                        }
                    } else if (action.equalsIgnoreCase("TURN ON THE STOVE")) {
                        count++;
                        System.out.println("The stove is broken. You couldn't do anything with that.");
                    } else if (action.equalsIgnoreCase("SEARCH THE TABLE")) {
                        count++;
                        System.out.println("It was a plain table as introduced. Nothing to search here.");
                        //else=SLEEP, still count, wound =0
                    } else {
                        count++;
                        wound = 0;
                        System.out.println("You slept and full of energy!");
                    }
                }
                //print out count
                System.out.println("You have finished the game with " + count + " moves.");
                //prompt to play again
                System.out.println("Do you want to play again? (y/n)");
                playGameChoice = keyboard.nextLine();
            }
            gameStart=playGameChoice;
        }
        System.out.println("Thank you for playing \"Make your avocado toast\" game!");
    }
}
