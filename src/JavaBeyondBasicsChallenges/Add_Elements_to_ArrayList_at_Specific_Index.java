package JavaBeyondBasicsChallenges;

import java.util.ArrayList;

/**
 * Challenge:
 * Add Elements to ArrayList at Specific Index.
 * Medium
 * Problem Description
 * Create a program to add elements to ArrayList at specific index.
 *
 * Inside the main() method, declare a new string ArrayList called movies.
 * Add strings Avatar and Catch me if you can to movies using the add() function.
 * Print movies.
 * Add the string Batman between Avatar and Catch me if you can.
 * Print movies again.
 * Example
 * Expected Output
 *
 * [Avatar, Catch me if you can]
 * [Avatar, Batman, Catch me if you can]
 */
public class Add_Elements_to_ArrayList_at_Specific_Index {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();

        // add Avatar to Arraylist
        movies.add("Avatar");

        // add Catch me if you can to Arraylist
        movies.add("Catch me if you can");

        // print the Arraylist
        System.out.println(movies);

        // add Batman at index 1
        movies.add(1, "Batman");

        // print the Arraylist
        System.out.println(movies);
    }
}
