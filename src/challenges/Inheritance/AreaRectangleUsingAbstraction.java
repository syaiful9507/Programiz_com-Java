package challenges.Inheritance;

import java.util.Scanner;

class QUESTION_AreaRectangleUsingAbstraction {
/*
Challenge:
Area of Rectangle using Abstraction
Hard

Problem Description
Create a program to calculate the area of a rectangle.

Step 1:
* Create an abstract class named Polygon with an abstract method calculateArea().
* Create another class named Rectangle that inherits from the Polygon class.
* Inside the class, create two fields length and breadth.
* Use a parameterized constructor with parameters length and breadth to initialize the fields.
* Also, provide the implementation of the calculateArea() method to compute the area of the rectangle and print it.

Step 2:
* Create the main() method inside a Main class.
* Get integer inputs for the length and breadth variables.
* Create an object of the Rectangle class with arguments length and breadth.
* Call the calculateArea() method using the object.

Example
Test Input
5
9

Expected Output
45
 */
}

abstract  class Polygon_1135 {
    abstract void calculateArea();
}
class Rectangle_1137 extends Polygon_1135 {
    int length, breadth;

    Rectangle_1137(int length, int breadth){
        this.length= length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        int area = length * breadth;
        System.out.println(area);
    }
}
public class AreaRectangleUsingAbstraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();
        Rectangle_1137 rect = new Rectangle_1137(length, breadth);
        rect.calculateArea();
    }
}
