package basicProgram.challenges.array;
/*
Multiply Array by 10

Problem Description
Create a program to multiply each element of an basicProgram.array by 10.

- Create an integer basicProgram.array of size 5.
- Get input values for the basicProgram.array.
- Run a foreach basicProgram.loop to access each element of the basicProgram.array.
- Inside the basicProgram.loop, multiply each element of the basicProgram.array by 10 and print it.

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

        // create an basicProgram.array
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        // get input values for numbers using a for basicProgram.loop
        for (int i = 0; i < numbers.length ; ++i ){
            numbers[i] = in.nextInt();
        }

        // access basicProgram.array elements using the foreach basicProgram.loop
        // multiply each element by 10 and print it
        for (int num : numbers) {
          System.out.println((num*10));
        }

        //input.close();
    }
}
