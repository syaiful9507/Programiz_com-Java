package JavaBeyondBasicsChallenges;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Challenge:
 * Add Elements to LinkedList at Specific Index
 * Easy
 * Problem Description
 * Create a program to add elements to linkedlist at specific index.
 *
 * Inside the main() method, declare a new string LinkedList called menu.
 * Take three string inputs from the user and store them in input1, input2, input3 variables.
 * Add user inputs to the menu linkedlist using the add() function.
 * Print menu.
 * Add the string Pizza at index 1 of the menu linkedlist using add().
 * Print menu again.
 * Example
 * Test Input
 *
 * Fries
 * Burger
 * Noodles
 * Expected Output
 *
 * [Fries, Burger, Noodles]
 * [Fries, Pizza, Burger, Noodles]
 */
public class Add_Elements_to_LinkedList_at_Specific_Index {
    public static void main(String[] args) {
// create a LinkedList of String type named menu
        LinkedList<String> menu = new LinkedList<>();

        // take 3 String input from user
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add elements to menu
        menu.add(input1);
        menu.add(input2);
        menu.add(input3);

        // print the LinkedList
        System.out.println(menu);

        // insert Pizza at index 1
        menu.add(1, "Pizza");

        // print menu
        System.out.println(menu);
        input.close();
    }
}
