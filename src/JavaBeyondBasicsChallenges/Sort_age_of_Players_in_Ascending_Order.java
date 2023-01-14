package JavaBeyondBasicsChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Challenge:
 * Sort age of Players in Ascending Order
 * Easy
 * Problem Description
 * Create a program to sort the age of players in ascending order.
 *
 * Import java.util.ArrayList; , java.util.Collections; and java.util.Scanner;.
 * Create a new integer arraylist called age.
 * Take three int inputs from the user and store them in input1, input2, input3 to store age.
 * Add int input1, input2 and input3 to age using add().
 * Print age.
 * Using the sort() method of Collections, sort the age of ArrayList.
 * Print age again.
 * Example
 * Test Input
 *
 * 18
 * 22
 * 21
 * Expected Output
 *
 * [18, 22, 21]
 * [18, 21, 22]
 */
public class Sort_age_of_Players_in_Ascending_Order {
    public static void main(String[] args) {
        // create an ArrayList of Integer
        ArrayList<Integer> age = new ArrayList<>();

        // take three int input from user to store age
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // add elements to age
        age.add(input1);
        age.add(input2);
        age.add(input3);

        // print age
        System.out.println(age);

        // sort elements of age
        Collections.sort(age);

        // print sorted age
        System.out.println(age);
        input.close();
    }
}
