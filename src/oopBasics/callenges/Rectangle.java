package oopBasics.callenges;
/*
Compute the area of a rectangle
As we are computing the area of the rectangle, we will create a class named Rectangle. Inside the class, we will create:

- fields - length and breadth
- constructor - assign values to length and breadth
- method - to compute the area of a rectangle
 */
public class Rectangle {
    int length, breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int computeAreaRectangle(){
        int area = this.length * this.breadth;
        return area;
    }
}

