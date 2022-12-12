package oopAdvance;
/*

Hard
Problem Description
Create a program to overload a method with different numbers of parameters.

Step 1:
* Create a class named Addition with two methods having the same name addNumbers()
* The first addNumbers() method will take two integer parameters, perform addition and print the result.
* The second addNumbers() method will take 4 integer parameters, perform addition and print the result.

Step 2:
* Inside the main() method, get integer inputs for variables n1, n2, n3, and n4.
* Create an object of Addition.
* Call the addNumbers() method with arguments n1 and n2.
* Again call addNumbers() with arguments n1, n2, n3, and n4.

Example
Test Input
4
5
7
9

Expected Output
9
25
 */

import java.util.Scanner;

class Additionn {
    void addNumbers(int n1, int n2){
        int add = n1 + n2;
        System.out.println(add);
    }

    void addNumbers(int n1, int n2, int n3, int n4){
        int add = n1 + n2 + n3 + n4;
        System.out.println(add);
    }
}
public class MethodOverloadingwithParameterNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();

        Additionn add = new Additionn();
        add.addNumbers(n1, n2);
        add.addNumbers(n1,n2,n3,n4);
    }
}
