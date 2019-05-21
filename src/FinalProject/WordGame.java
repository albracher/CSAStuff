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
                System.out.println("Type \"e\" to go to the East, towards the Great Lake.");

                location = "Kitchen";
            }

        } else if (input.equals("e")) {
            //FROM HERE, THE "GREAT LAKE"
            System.out.println("You are now by the Great Lake.");
            System.out.println("Type \"e\" to go to the East, towards a bonfire.");
            System.out.println("Type \"e\" to go to the East, towards the Great Lake.");
            location = "Great Lakes";


        }
    }
}
