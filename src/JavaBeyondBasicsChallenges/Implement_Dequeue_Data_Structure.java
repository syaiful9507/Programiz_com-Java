package JavaBeyondBasicsChallenges;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Challenge:
 * Implement Dequeue Data Structure
 * Hard
 * Problem Description
 * Create a program to implement dequeue data structure.
 *
 * Inside the main() method, declare a new string LinkedList called movies.
 * Take three string inputs from the user and store them in the input1, input2, input3 variables.
 * Add input1 to the movies linkedlist using add().
 * Use addFirst() to add input2 to the front and addLast() to add input3 at the end of the movies linkedlist.
 * Print movies.
 * Use removeFirst() and removeLast() to remove the elements at first and last position.
 * Print movies again.
 * Example
 * Test Input
 *
 * Avengers
 * Avatar
 * Batman
 * Expected Output
 *
 * [Avatar, Avengers, Batman]
 * [Avengers]
 */
public class Implement_Dequeue_Data_Structure {
    public static void main(String[] args) {
// create a LinkedList of String type
        LinkedList<String> movies = new LinkedList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // use add() to insert input1 to movies
        movies.add(input1);

        // use AddFirst() to insert input2 at the beginning of movies
        movies.addFirst(input2);

        // Use addLast() to insert input3 at the end of movies
        movies.addLast(input3);

        // print movies
        System.out.println(movies);

        // remove element from the beginning of movies
        movies.removeFirst();

        // remove element from the end of the movies
        movies.removeLast();

        // print movies
        System.out.println(movies);

        input.close();
    }
}
