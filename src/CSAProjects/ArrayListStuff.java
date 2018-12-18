package CSAProjects;
import java.util.*;

public class ArrayListStuff {
    public static void main (String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("red");
        array.add("blue");
        array.add("purple");
        array.add("green");
        System.out.println(array.size());
        System.out.println(array);
        array.set(2, "black");
        System.out.println(array);
        System.out.println(array.get(3));
        System.out.println(array);
        if (array.contains("black")) {
            System.out.println("\"Black\" is in the array.");
        } else if (!array.contains("black")) {
            System.out.println("\"Black\" is not in the array.");
        }
    }
    public static int[] array() {
        int[] yay = new int[5]
    }
}
