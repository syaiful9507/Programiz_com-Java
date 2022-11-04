package basicProgram.loop;
/*
Factor of a Number

Problem Description
-Create a program to find the factors of a number except the number.
-The factors of a number n are all the numbers that perfectly divide n. For example,
-Factors of 24: 1, 2, 3, 4, 6, 12
* Note: We are excluding the number n.

-Get input value for a variable named number.
-Run a for basicProgram.loop from i = 1 to i < number.
-In each iteration of the basicProgram.loop, check if number is perfectly divisible by i.
-If true, print the value of i.

Example
Test Input
24

Expected Output
1
2
3
4
6
8
12
 */
public class FactorOfNumber {
    public static void main(String[] args) {
        int number = 24;
        for (int i = 1; i < number; i++) {
            System.out.println("disible : " + (number % i));
            if (number % i == 0){
                System.out.println(i);
            }
        }

    }
}
