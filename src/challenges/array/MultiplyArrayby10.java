package challenges.array;
/*
Multiply Array by 10

Problem Description
Create a program to multiply each element of an array by 10.

- Create an integer array of size 5.
- Get input values for the array.
- Run a foreach loop to access each element of the array.
- Inside the loop, multiply each element of the array by 10 and print it.

Example
Test Input
1
2
3
4
5

Expected Output
10
20
30
40
50
 */
import java.util.Scanner;

public class MultiplyArrayby10 {
    public static void main(String[] args) {

        // create an array
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        // get input values for numbers using a for loop
        for (int i = 0; i < numbers.length ; ++i ){
            numbers[i] = in.nextInt();
        }

        // access array elements using the foreach loop
        // multiply each element by 10 and print it
        for (int num : numbers) {
          System.out.println((num*10));
        }

        //input.close();
    }
}
