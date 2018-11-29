//Allen Phu 2018, pokemonBattle method, allows one to input values to simulate a battle
package Pokemon;

import java.util.Scanner;

public class pokemonBattle {
    public static void main(String[] args) {
        //Executes Exercise 1
        //stores pokemon name as battleStart
        String pokemon = battleStart();
        System.out.println("test 1: " + pokemon + "\n");
        //Executes Exercise 2
        //Stores pokemon name in "pokemon" and spits out hp after damage
        int hp = damage(pokemon);
        System.out.println("\ntest 2: " + hp + "\n");
        //Executes Exercise 3
        statsTable(pokemon, hp, 100, 90, 80, 70, 60, 50, "Thunder/Lightning/Whining");
    }


    //Exercise 1
    private static String battleStart() {
        Scanner console = new Scanner(System.in);
        System.out.println("Another trainer is issuing a challenge!");
        System.out.println("Zebstrika appeared.");
        System.out.print("Which Pokemon do you choose? ");
        //use scanner to get Pokemon name
        String name = console.next();
        System.out.println();
        System.out.println("You choose " + name + "!");
        //You choose (pokemonName)!
        System.out.println("It's a Pokemon battle between " + name + " and Zebstrika! Go!");
        //stores pokemon name as method battleStart
        return name;
    }

    //Exercise 2
    private static int damage(String x) {
        System.out.println("Zebstrika used Thunderbolt!");
        //uses String x as pokemon's name, or in the main method, damage(pokemon), string is "pokemon"
        System.out.println("Trainer, what are your " + x + "'s stats?");
        //scans input for level, attack, defense, base, stab, and hp stats
        Scanner console = new Scanner(System.in);
        System.out.print("Level: ");
        int numLvl = console.nextInt();
        System.out.print("Attack: ");
        int numAtk = console.nextInt();
        System.out.print("Defense: ");
        int numDef = console.nextInt();
        System.out.print("Base: ");
        int numBase = console.nextInt();
        System.out.print("STAB: ");
        int numSTAB = console.nextInt();
        System.out.print("HP: ");
        int numHP = console.nextInt();
        // Random number creator using Math.Random, USED
        // https://stackoverflow.com/questions/7961788/math-random-explanation - EDIT2
        double randomNum = Math.random() * ((1 - 0.85) + 0.85);
        //Modifier: numStab times a random number 0.85-1
        int numModifier = (int) (numSTAB * randomNum);
        //Damage equation
        int dmg = (((2 * numLvl + 10) / 250) + (numAtk / numDef) * numBase + 2) * numModifier;
        System.out.println();
        //X is pokemon's name, DMG is amount of damage taken
        System.out.println(x + " sustained " + dmg + " points damage.");
        //newHP is the HP after taking damage
        int newHP = numHP - dmg;
        System.out.println("HP, after damage, are now " + newHP + ".");
        //return newHP to method damage
        return newHP;
    }

    //Exercise 3
    //take in all variables from Main and output them below
    //everything is an int
    private static void statsTable(String pokeName, int HP, int LVL, int ATK, int DEF, int SPATK, int SPDEF, int SPD, String moves) {
        System.out.println("Name: " + pokeName);
        System.out.println("HP: " + HP);
        System.out.println("Level: " + LVL);
        System.out.println("Attack: " + ATK);
        System.out.println("Defense: " + DEF);
        System.out.println("SP. ATK: " + SPATK);
        System.out.println("SP. DEF: " + SPDEF);
        System.out.println("Speed: " + SPD);
        System.out.println("Moves Learned: " + moves);
    }

}

