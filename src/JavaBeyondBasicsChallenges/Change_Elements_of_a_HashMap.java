package JavaBeyondBasicsChallenges;

import java.util.HashMap;

/**
 * Challenge:
 * Change Elements of a HashMap
 * Medium
 * Problem Description
 * Create a program to change elements of a hashmap.
 *
 * Import java.util.HashMap;.
 * Declare a new HashMap called name of string type key and integer type value.
 * Add an element with key Jimmy and value 1 using put().
 * Add another element with key Chandler and value 2 using put().
 * Print name.
 * Using replace(), change the value of the element with key Jimmy to 100.
 * Print name again.
 * Example
 * Expected Output
 *
 * {Chandler=2, Jimmy=1}
 * {Chandler=2, Jimmy=100}
 */
public class Change_Elements_of_a_HashMap {
    public static void main(String[] args) {
// create HashMap of String key & Integer value
        HashMap<String, Integer> name = new HashMap<>();

        // add elements to name
        name.put("Jimmy", 1);
        name.put("Chandler", 2);

        // print name
        System.out.println(name);

        // change 1 to 100
        name.replace("Jimmy", 100);

        // print name again
        System.out.println(name);
    }
}
