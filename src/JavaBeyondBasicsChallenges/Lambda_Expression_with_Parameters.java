package JavaBeyondBasicsChallenges;

import java.util.Scanner;

/**
 * Challenge:
 * Lambda Expression with Parameters
 * Hard
 * Problem Description
 * Create a program to implement an abstract method with lambda expression.
 *
 * Create a functional interface named MultiplyNumbers.
 * Create an abstract void method named multiply() with parameters int x and int y.
 * Inside the main() method use the lambda expression to implement the multiply() method.
 * Take two int inputs from the user and store them in input1, input2.
 * Call the multiply() method and pass input1 and input2 to it.
 * Example
 * Test Input
 *
 * 2
 * 3
 * Expected Output
 *
 * 6
 */

@FunctionalInterface
interface MultiplyNumbers{
    abstract void multiply(int x, int y);
}
public class Lambda_Expression_with_Parameters {
    public static void main(String[] args) {
        MultiplyNumbers obj = (x, y) -> {
            System.out.println(x*y);
        };

        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        obj.multiply(input1, input2);
    }
}
