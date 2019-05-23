package FinalProject;

public class WordGame {
    public String gameOne(String input) {
        String response;
        //use this for debugging
        String location;
        //Use this template for stuff
        //"Type \"e\" to go to the East, towards the Great Lake."

        //step one: intro
        System.out.println("You are in the woods. You may not be in the middle of nowhere, and see various locations around you.");
        System.out.println("Type \"n\" to go to the North, towards the abandoned house.");
        System.out.println("Type \"e\" to go to the East, towards the Great Lake.");
        if (input.length() == 0) {
            System.out.println("Type something.");
            location = "Woods";
        } else if (input.equals("n")) {
            //FROM HERE, THE "ABANDONED HOUSE" PATH STARTS
            System.out.println("You are now inside an old and abandoned home. It appears to be dusty and dark.");
            System.out.println("Type \"k\" to go towards the kitchen.");
            System.out.println("Type \"b\" to go towards the basement.");
            location = "Abandoned House";
            if (input.equals("k")) {
                System.out.println("You are now in the musty kitchen.");
                System.out.println("Type \"f\" to open the fridge.");
                System.out.println("Type \"l\" to look at the table and check it out.");
                location = "Kitchen";
            }

        } else if (input.equals("e")) {
            //FROM HERE, THE "GREAT LAKE"
            System.out.println("You are now by the Great Lake.");
            System.out.println("Type \"e\" to go to the East, towards a bonfire.");
            System.out.println("Type \"n\" to go to the North, towards the running car.");
            location = "Great Lakes";

            if (input.equals("e")) {
                System.out.println("You are now in the far East, and there is a bonfire.");
                location = "Bonfire East";
            } else if (input.equals("n")) {
                System.out.println("You are now in front of the car.");
                System.out.println("The car is still running and there is nobody in it.");
                System.out.println("Type \"g\" to get in the car and drive away towards the road.");
                System.out.println("Type \"a\" to analyze and check out the car before continuing.");
                location = "running car";
                    if (input.equals("g")) {
                        System.out.println("The car's engine starts rumbling after three minutes, and breaks down on the side of the road.");
                        System.out.println("You are left in the middle of nowhere, and cannot go any further.");
                    } else if (input.equals("a")) {
                        System.out.println("You check out the car and check out to see if there's anything wrong with the car.");
                    }
                    }

            }
        }
    }
}
