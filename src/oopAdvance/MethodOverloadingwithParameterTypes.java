package oopAdvance;
/*
Method Overloading with Parameter Types
Hard
Problem Description
Create a program to overload a method with different types of parameters.

Step 1:
* Create a class named Addition with two methods having the same name add().
* The first add() method will take two integer parameters, perform addition and print the result.
* The second add() method will take two string parameters, join them and print the result.

Step 2:
* Inside the main() method, get integer inputs for variables number1 and number2.
* Also, get string input for variables first and second.
* Create an object of Addition.
* Call the add() method with arguments number1 and number2.
* Again call add() with arguments first and second.

Example
Test Input
5
8
java
oop

Expected Output
13
javaoop
 */

import java.util.Scanner;

class Addition {
    void add(int a, int b){
        int ab = a + b;
        System.out.println(ab);
    }

    void add (String a, String b){
        String ab = a.concat(b);
        System.out.println(ab);
    }
}
public class MethodOverloadingwithParameterTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numa, numb;
        String strA, strB;
        numa = in.nextInt();
        numb = in.nextInt();

        strA = in.next();
        strB = in.next();

        //Create methode addition
        Addition addition = new Addition();
        addition.add(numa, numb);
        addition.add(strA, strB);

    }
}
