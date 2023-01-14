package JavaBeyondBasicsChallenges;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Challenge:
 * Access Elements of an LinkedList
 * Easy
 * Problem Description
 * Create a program to access elements of an linkedlist.
 *
 * Inside the main() method, declare a new string LinkedList called series.
 * Take three string inputs from the user and store them in input1, input2, input3 variables.
 * Add user inputs to the series linkedlist using the add() function.
 * Using the get() method of LinkedList, access its third element (index 2) and store it in a variable.
 * Print the element.
 * Example
 * Test Input
 *
 * Friends
 * Dark
 * You
 * Expected Output
 *
 * You
 */
public class Access_Elements_of_an_LinkedList {
    public static void main(String[] args) {
// create an LinkedList of String type
        LinkedList<String> series = new LinkedList<>();

        // take 3 String input from user
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add elements to series
        series.add(input1);
        series.add(input2);
        series.add(input3);

        // get element at index 2 using get()
        String name = series.get(2);

        // print name
        System.out.println(name);
        input.close();
    }
}
