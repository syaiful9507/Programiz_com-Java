package JavaBeyondBasicsChallenges;

import java.util.HashMap;

/**
 * Challenge:
 * Remove Elements of a HashMap
 * Easy
 * Problem Description
 * Create a program to remove the element of a hashmap.
 *
 * Import java.util.HashMap;.
 * Declare a new HashMap called name with the string type key and integer type value.
 * Add an element with key Patrick and value 1 using put().
 * Add another element with key SpongeBob and value 2 using put().
 * Print name.
 * Using remove(), remove the element with key Patrick.
 * Print name again.
 * Example
 * Expected Output
 *
 * {Patrick=1, SpongeBob=2}
 * {SpongeBob=2}
 */
public class Remove_Elements_of_a_HashMap {
    public static void main(String[] args) {
        // create HashMap of String key & Integer value
        HashMap<String, Integer> name = new HashMap<>();

        // add elements to name
        name.put("Patrick", 1);
        name.put("SpongeBob", 2);

        // print name
        System.out.println(name);

        // remove element with key Patrick
        name.remove("Patrick");

        // print name again
        System.out.println(name);
    }
}
