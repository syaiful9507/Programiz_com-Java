package JavaBeyondBasicsChallenges;

import java.util.HashMap;

/**
 * Challenge:
 * Access Elements of a HashMap
 * Easy
 * Problem Description
 * Create a program to access elements of a hashmap.
 *
 * Import java.util.HashMap;.
 * Declare a new HashMap called song of integer key and string value.
 * Add an element with key 1 and value yesterday using put().
 * Add another element with key 2 and value 21 guns using put().
 * Print song.
 * Using get(), access the value of the element with key 2.
 * Store it in value and print value.
 * Example
 * Expected Output
 *
 * 21 guns
 */
public class Access_Elements_of_a_HashMap {
    public static void main(String[] args) {
// create Map of Integer key & String value
        HashMap<Integer, String> song = new HashMap<>();

        // add elements to song
        song.put(1, "yesterday");
        song.put(2, "21 guns");

        // access value of song with key 2
        String value = song.get(2);

        // print value
        System.out.println(value);
    }
}
