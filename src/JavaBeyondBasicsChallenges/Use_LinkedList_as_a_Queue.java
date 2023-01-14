package JavaBeyondBasicsChallenges;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Challenge:
 * Use LinkedList as a Queue
 * Hard
 * Problem Description
 * Create a program to java program to implement queue data structure.
 *
 * Inside the main() method, declare a new integer LinkedList called numbersList.
 * Take three integer inputs from the user and store them in the input1, input2, input3 variables.
 * Add user inputs to the numbersList linkedlist using the add() function.
 * Print numbersList.
 * Use the poll() method to remove elements from the start.
 * Using the offer() method, add element 20 at the end.
 * Print numbersList again.
 * Example
 * Test Input
 *
 * 1
 * 2
 * 3
 * Expected Output
 *
 * [1, 2, 3]
 * [2, 3, 20]
 */
public class Use_LinkedList_as_a_Queue {
    public static void main(String[] args) {
// create a LinkedList of Integer type
        LinkedList<Integer> numbersList = new LinkedList<>();

        // take 3 int input from user
        Scanner input = new Scanner(System.in);

        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // add elements
        numbersList.add(input1);
        numbersList.add(input2);
        numbersList.add(input3);

        // print numbersList
        System.out.println(numbersList);

        // remove element from the front
        numbersList.poll();

        // add element 20 at the end
        numbersList.offer(20);

        // print numbersList
        System.out.println(numbersList);
        input.close();
    }
}
