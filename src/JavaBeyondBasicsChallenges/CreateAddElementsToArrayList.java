package JavaBeyondBasicsChallenges;

import java.util.ArrayList;

/**
 * Challenge:
 * Create and Add Elements to an ArrayList
 * Easy
 * Problem Description
 * Create a program to create and add elements to an arraylist.
 *
 * Import java.util.ArrayList
 * Inside the main() method, declare a string type ArrayList named series.
 * Use the add() method, to add strings Friends and Money Heist respectively.
 * Print series.
 * Example
 * Expected Output
 *
 * [Friends, Money Heist]
 */
public class CreateAddElementsToArrayList {
    public static void main(String[] args) {
        ArrayList<String> series = new ArrayList<>();
        series.add("Friends");
        series.add("Money Heist");
        System.out.println(series);
    }
}
