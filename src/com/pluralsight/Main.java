package com.pluralsight;

import java.util.Scanner;

public class Main {

    /*
    https://programmingbydoing.com/

    Choose your own short adventure 2 - Assignment #63
     */
    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.println("WELCOME TO KRYSTIN'S SHORT ADVENTURE!");

        int nextroom = 1;
        String choice = "";

        while ( nextroom != 0 )
        {
            if ( nextroom == 1 )
            {
//START
                System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"? ");
                System.out.print( "> " );
                choice = keyboard.nextLine();
                if ( choice.equalsIgnoreCase("kitchen") )
                    nextroom = 2;
                else if ( choice.equalsIgnoreCase("upstairs") )
                    nextroom = 3;
                else
                    System.out.println( choice + " wasn't one of the options. Try again." );
            }
//CHOICE = KITCHEN
            if ( nextroom == 2 )
            {
                System.out.println("There is a long counter-top with dirty dishes everywhere. Off to one side there is, as you'd " +
                        "expect, a refrigerator. You may open the \"refrigerator\",look in a \"cabinet\" or go \"back\".");
                System.out.print( "> " );
                choice = keyboard.nextLine();
                if ( choice.equalsIgnoreCase("back") )
                    nextroom = 1;
                else if (choice.equalsIgnoreCase("refrigerator"))
                    nextroom = 4;
                else if (choice.equalsIgnoreCase("cabinet"))
                    nextroom = 5;
                else
                    System.out.println( choice + " wasn't one of the options. Try again." );
            }
//CHOICE = UPSTAIRS
            if ( nextroom == 3 )
            {
                System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\" where you " +
                        "can explore or you can go \"back\". Where would you like to go?");
                choice = keyboard.nextLine();
                System.out.print( "> " );
                if ( choice.equalsIgnoreCase("back") )
                    nextroom = 1;
                else if (choice.equalsIgnoreCase("bedroom"))
                    nextroom = 6;
                else
                    System.out.println( choice + " wasn't one of the options. Try again." );
            }
//CHOICE = REFRIGERATOR
            if ( nextroom == 4 )
            {
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. " +
                                "Would you like to eat some of the food? (\"yes\" or \"no\") or go \"back\".");
                choice = keyboard.nextLine();
                System.out.print( "> " );
                if ( choice.equalsIgnoreCase("back") )
                    nextroom = 2;
                else if (choice.equalsIgnoreCase("no")) {
                    System.out.println("You die of starvation...eventually. Thanks for playing!");
                    nextroom = 0;
                }
                else if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("You take a bite of some rather moldy cheese and immediately start convulsing. " +
                            "When you crumple to the ground and begin to black out, your last thought is. This was a " +
                            "really cheezy adventure..... Thanks for playing!");
                    nextroom = 0;
                }
                else {
                    System.out.println(choice + " wasn't one of the options. Try again.");
                }
            }
//CHOICE = CABINET
            if ( nextroom == 5 )
            {
                System.out.println("All of the shelves inside the cabinet have been removed and there is a " +
                        "giant hole in the back which leads through the wall and down a dark passageway. Do you" +
                        " want to try the passageway? (\"yes\" or \"no\") or go \"back\".");
                choice = keyboard.nextLine();
                System.out.print( "> " );
                if ( choice.equalsIgnoreCase("back") )
                    nextroom = 2;
                else if (choice.equalsIgnoreCase("no")) {
                    System.out.println("What a wimp. Pretty bogus adventure if you aren't up for some adventuring... " +
                            "Thanks for playing!");
                    nextroom = 0;
                }
                else if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("You walk through the opening and are blinded by the darkness. You hear footsteps" +
                            " behind you and turn just in time to see a dark figure looming over you. You scream, but" +
                            " it's too late. You are hit over the head, dragged outside to the cliffs and thrown into " +
                            "the water crashing against the rocks below. Thanks for playing!");
                    nextroom = 0;
                }
                else {
                    System.out.println(choice + " wasn't one of the options. Try again.");
                }
            }
//CHOICE BEDROOM
            if ( nextroom == 6 )
            {
                System.out.println("You are in a plush bedroom, with expensive looking hardwood furniture. The bed" +
                        " is unmade. In the back of the room, the closet door is ajar. Would you like to open" +
                        " the door? (\"yes\" or \"no\") or go \"back\"");
                choice = keyboard.nextLine();
                System.out.print( "> " );
                if ( choice.equals("back") )
                    nextroom = 3;
                else if(choice.equals("no")) {
                    System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing!");
                    nextroom = 0;
                }
                else {
                    System.out.println("You open the creaky doors to the closet and find.......a dusty closet. Wah wah." +
                            " That was rather anti-climactic. Thanks for playing!");
                    nextroom = 0;
                }
            }

        }

        System.out.println( "\nThe game is over. The next episode can be downloaded for only 800 Microsoft points!" );


    }

}

