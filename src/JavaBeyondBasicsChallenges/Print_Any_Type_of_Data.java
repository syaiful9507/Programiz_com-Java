package JavaBeyondBasicsChallenges;
/**
 * Challenge:
 * Print Any Type of Data
 * Medium
 * Problem Description
 * Create a program that prints any type of data.
 *
 * Create a Generic method named display of void return type.
 * Pass T data as a parameter and print the passed data inside the method.
 * Inside the Main method, take a string input from the user and store it in the input1 variable.
 * Call the display method and pass a string value input1.
 * Example
 * Test Input
 *
 * Hello
 * Expected Output
 *
 * Hello
 */

import java.util.Scanner;

public class Print_Any_Type_of_Data {
    // create a generics method
    // pass T data as a parameter
    public <T> void display(T data) {

        // print data
        System.out.println(data);
    }
    public static void main(String[] args) {

        // create object of Main class
        Print_Any_Type_of_Data obj = new Print_Any_Type_of_Data();

        // take string input from the user
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();

        // call generics method and pass input1
        obj.<String>display(input1);

    }
}
