package JavaBeyondBasicsChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Challenge:
 * Finding nemo
 * Easy
 * Problem Description
 * Create a program to find nemo.
 *
 * Import java.util.ArrayList;, java.util.Collections; and java.util.Scanner;.
 * Create a new String ArrayList called fish.
 * Take three string inputs from the user and store them in input1, input2, input3.
 * Add input1, input2, input3 to fish using add().
 * Using the binarySearch() method of Collections, search element nemo in the fish arraylist.
 * Store returned integer in pos.
 * Check if nemo is present in fish arraylist. ( Hint: Check if the value of pos is greater or equal to 0.)
 * If so print pos.
 * Else print Not Found.
 * Note: We will assume that the user will always enter the input in alphabetical order.
 *
 * Example
 * Test Input
 *
 * dory
 * gill
 * nemo
 * Expected Output
 *
 * 2
 */
public class Finding_nemo {
    public static void main(String[] args) {
        // create an ArrayList of string called fish
        ArrayList<String> fish = new ArrayList<>();

        // take 3 input from user
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add elements to fish
        fish.add(input1);
        fish.add(input2);
        fish.add(input3);

        // search nemo in fish
        int pos = Collections.binarySearch(fish, "nemo");

        // check if nemo is present in fish ArrayList
        if (pos >= 0) {
            // print pos
            System.out.println(pos);
        }
        else {
            // print Not Found
            System.out.println("Not Found");
        }
        input.close();
    }
}

