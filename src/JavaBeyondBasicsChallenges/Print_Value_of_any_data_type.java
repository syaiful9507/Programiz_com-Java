package JavaBeyondBasicsChallenges;

import java.util.Scanner;

/**
 * Challenge:
 * Print value of any data type
 * Easy
 * Problem Description
 * Create a program to print value of any data type.
 *
 * Import java.util.Scanner;
 * Create a generics class named PrintData.
 * Inside it, create a constructor with parameter T data.
 * Print data inside the constructor.
 * Create a Main class
 * Take an int input from the user and store it in the input1 variable.
 * Create an object of PrintData that accepts Integer data. Pass input1 to the object.
 * Example
 * Test Input
 *
 * 2
 * Expected Output
 *
 * 2
 */
class PrintData<T> {

    // create a constructor with parameter T data
    public PrintData(T data) {

        // print the value of data
        System.out.println(data);
    }
}
public class Print_Value_of_any_data_type {
    public static void main(String[] args) {
        // take an integer input
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();

        // create an object of PrintData object with Integer data
        PrintData<Integer> print = new PrintData<>(input1);
    }
}
