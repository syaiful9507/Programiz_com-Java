package JavaBeyondBasicsChallenges;
/**
 * Challenge:
 * Modify Elements of an ArrayList
 * Medium
 * Problem Description
 * Create a program to modify elements of an arraylist.
 *
 * Inside the main() method, declare a new integer ArrayList called marks
 * Take three integer inputs from the user and store them in the input1, input2, input3 variables.
 * Add input values in the marks arraylist using the add() method.
 * Print marks.
 * Using the set() method of marks, change its second element (index 1) to 86.
 * Print marks again.
 * Example
 * Test Input
 *
 * 33
 * 44
 * 55
 * Expected Output
 *
 * [33, 44, 55]
 * [33, 86, 55]
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Modify_Elements_of_an_ArrayList {
    public static void main(String[] args) {
        // create an ArrayList of Integer called marks
        ArrayList<Integer> marks = new ArrayList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // add input1, input2, and input3 to marks
        marks.add(input1);
        marks.add(input2);
        marks.add(input3);

        // print the Arraylist
        System.out.println(marks);

        // modify the value of input2
        marks.set(1, 86);

        // print marks again
        System.out.println(marks);
        input.close();
    }
}
