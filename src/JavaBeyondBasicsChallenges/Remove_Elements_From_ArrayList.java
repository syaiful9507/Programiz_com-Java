package JavaBeyondBasicsChallenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Challenge:
 * Remove Elements From ArrayList
 * Medium
 * Problem Description
 * Create a program to remove elements from arraylist.
 *
 * Inside the main() method, declare a new string ArrayList called languages.
 * Take three string inputs from the user and store them in the input1, input2, input3 variables.
 * Add user inputs to the languages arraylist using the add() function.
 * Print languages.
 * Use the remove() method to remove the second element (index 1) from the languages arraylist.
 * Print languages again.
 * Example
 * Test Input
 *
 * Java
 * HTML
 * C#
 * Expected Output
 *
 * [Java, C#]
 */
public class Remove_Elements_From_ArrayList {
    public static void main(String[] args) {
// create an arraylist of String type
        ArrayList<String> languages = new ArrayList<>();

        // take 3 String input from user
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add input1, input2 & input3 to languages
        languages.add(input1);
        languages.add(input2);
        languages.add(input3);

        // remove element at index 1
        languages.remove(1);

        // print ArrayList
        System.out.println(languages);
        input.close();
    }
}
