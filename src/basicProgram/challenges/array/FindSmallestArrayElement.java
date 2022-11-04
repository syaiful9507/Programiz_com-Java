package basicProgram.challenges.array;
/*
Find Smallest Array Element

Problem Description
Create a program to find the smallest element from an basicProgram.array.

- Create an integer basicProgram.array named numbers of size 5.
- Get input value for the basicProgram.array.
- Create an integer variable named smallest and assign the first element of the basicProgram.array to it.
- Run a for basicProgram.loop from i = 1 to i < numbers.length.
- Inside the basicProgram.loop, if the element at i is less than smallest, assign that element to smallest.
- Finally, print the value of smallest.

Example
Test Input
13
23
9
31
19

Expected Output
9
 */
import java.util.Scanner;

public class FindSmallestArrayElement {
    public static void main(String[] args) {

        // create an basicProgram.array
        int[] numbers = new int[5];
        // get input values for numbers
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextInt();
        }

        // create a variable smallest and assign the first element of numbers to it
        int smallest = numbers[0];

        // run a for basicProgram.loop from i = 1 to i < numbers.length
        for (int i = 0; i < numbers.length; i++) {

            // check if basicProgram.array element is smaller than smallest
            // if true, assign the element to smallest
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // print smallest
        System.out.println(smallest);
    }
}
