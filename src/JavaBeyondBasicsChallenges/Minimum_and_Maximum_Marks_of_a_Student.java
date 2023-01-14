package JavaBeyondBasicsChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Challenge:
 * Minimum and Maximum Marks of a Student
 * Medium
 * Problem Description
 * Create a program to find minimum and maximum elements of arraylist.
 *
 * Import java.util.ArrayList; , java.util.Collections; and java.util.Scanner;.
 * Create a new integer ArrayList called score.
 * Take three int inputs from the user and store them in input1, input2, input3 to store score.
 * Add input1, input2 and input3 to score using add().
 * Using the min() method of Collections, find the minimum score and print it.
 * Using the max() method of Collections, find the maximum score and print it.
 * Example
 * Test Input
 *
 * 66
 * 67
 * 68
 * Expected Output
 *
 * 66
 * 68
 */
public class Minimum_and_Maximum_Marks_of_a_Student {
    public static void main(String[] args) {
        // create an ArrayList of Integers
        ArrayList<Integer> score = new ArrayList<>();

        // take three int input from user to store score
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // add elements to score
        score.add(input1);
        score.add(input2);
        score.add(input3);
        // find minimum element in score
        int minimum = Collections.min(score);
        System.out.println(minimum);

        // find maximum element in score
        int maximum = Collections.max(score);
        System.out.println(maximum);

        input.close();

    }
}
