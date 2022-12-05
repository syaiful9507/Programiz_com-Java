package challenges.Inheritance;
class question {
/*
Challenge:
Multiple Classes Inherits a Class
Medium

Problem Description
Create a program where two classes inherit from a single class.

Step 1:
* Create a class named Polygon with the display() method.
* Inside the method, print A Polygon is created.
* Inherit two classes named Rectangle and Triangle from the same Polygon class.

Step 2:
* Create the main() method inside a Main class.
* Inside the method, create objects of both the Rectangle and Triangle class.
* Call the display() method of Polygon using the objects of Rectangle and Triangle.

Example
Expected Output
A Polygon is created
A Polygon is created
 */
}
class Polygon {
    void display(){
        System.out.println("A Polygon is created");
    }
}
class Rectangle extends Polygon {

}
class Triangle extends Polygon {

}
public class MultipleClassesInheritsClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        rectangle.display();
        triangle.display();
    }
}


