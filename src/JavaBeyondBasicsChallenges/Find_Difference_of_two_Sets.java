package JavaBeyondBasicsChallenges;

import java.util.HashSet;

/**
 * Challenge:
 * Find Difference of two Sets
 * Medium
 * Problem Description
 * Create a program to find differences between two hashsets.
 *
 * Import the HashSet class from java.util package.
 * Declare a new string type hashset called name1.
 * Add strings Shakira, Rihanna and Taylor to name1 using add().
 * Declare another hashset named name2.
 * Add strings Rihanna, Taylor and Beyonce to name2 using add().
 * Use the removeAll() method of name1 to remove all common elements with name2.
 * Print name1.
 * Example
 * Expected Output
 *
 * [Shakira]
 */
public class Find_Difference_of_two_Sets {
    public static void main(String[] args) {
// create a HashSet
        HashSet<String> name1 = new HashSet<>();

        // add elements to name1
        name1.add("Shakira");
        name1.add("Rihanna");
        name1.add("Taylor");

        // create a HashSet
        HashSet<String> name2 = new HashSet<>();

        // add elements to name2
        name2.add("Rihanna");
        name2.add("Taylor");
        name2.add("Beyonce");

        // find difference of sets
        name1.removeAll(name2);

        // print name1
        System.out.println(name1);
    }
}
