package JavaBeyondBasicsChallenges;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Challenge:
 * Find Intersection of two HashSets
 * Medium
 * Problem Description
 * Create a program to find intersection of two hashsets.
 *
 * Inside the main() method, declare a new string HashSet called wildAnimal.
 * Take three string inputs from the user and store them in input1, input2, input3.
 * Add input1, input2, input3 to wildAnimal using the add() method.
 * Declare another new string HashSet called domesticAnimal.
 * Take three string inputs from the user and store them in the input4, input5, input6.
 * Add input4, input5, input6 to domesticAnimal using the add() method.
 * Use the retainAll() method of wildAnimal to update it to its intersection with domesticAnimal.
 * Print wildAnimal.
 * Example
 * Test Input
 *
 * Cow
 * Dog
 * Rabbit
 * Lion
 * Tiger
 * Rabbit
 * Expected Output
 *
 * [Rabbit]
 */
public class Find_Intersection_of_two_HashSets {
    public static void main(String[] args) {
        // create a HashSet
        HashSet<String> wildAnimal = new HashSet<>();

        // take 3 String input from user
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add elements to wildAnimal
        wildAnimal.add(input1);
        wildAnimal.add(input2);
        wildAnimal.add(input3);

        // create another HashSet
        HashSet<String> domesticAnimal = new HashSet<>();

        // take 3 String input from user
        String input4 = input.nextLine();
        String input5 = input.nextLine();
        String input6 = input.nextLine();

        // add elements to domesticAnimal
        domesticAnimal.add(input4);
        domesticAnimal.add(input5);
        domesticAnimal.add(input6);

        // find intersection
        wildAnimal.retainAll(domesticAnimal);

        // print wildAnimal
        System.out.println(wildAnimal);
        input.close();
    }
}
