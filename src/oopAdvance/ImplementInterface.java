package oopAdvance;

import java.util.Scanner;
/* QUESTION
Challenge:
Implement Interface
Hard
Problem Description
Create a program to implement an interface.

Step 1:

* Create an interface named Polygon with an abstract method calculateArea().
* Implement the interface by the Square class.
* Inside the class, create a constructor to initialize the length field.
* Implement the calculateArea() method to compute the area of the square and print it.

Step 2:
* Create the main() method inside Main class.
* Get an integer input for the variable length.
* Create an object of Square with the length argument.
* Call the calculateArea() method using the object.

Example
Test Input
4

Expected Output
16
 */
interface Polygon {
    abstract void calculateArea();
}



class Square implements Polygon {
    int length;
    Square(int length){
        this.length = length;
    }

    @Override
    public void calculateArea() {
        int area = length * length;
        System.out.println(area);
    }
}
public class ImplementInterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        Square square = new Square(length);
        square.calculateArea();
    }
}
