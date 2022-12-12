package challenges;



import java.util.Scanner;
class Question{
    /*
Challenge:
Subtraction of Coordinates (level Medium)

#Problem Description
Create a program to subtract coordinates.

#Step 1:
* Create a class named Coordinate with two integer fields x and y to store values of x and y coordinates.
* Create a constructor to initialize the value of x and y using this.

#Step 2:
* Create the main() method inside a Main class.
* Get 4 coordinate inputs for variables x1, y1, x2, and y2.
* Create an object c1 of Coordinate with arguments x1 and y1.
* Create another object c2 of Coordinate with arguments x2 and y2.
* Subtract x coordinates of c1 and c2 objects and assign the result to xDiff.
* Subtract y coordinates of c1 and c2 objects and assign the result to yDiff.
* Print the value of xDiff and yDiff

#Example
Test Input
9
12
8
4

#Expected Output
1
8

 */
}
class Coordinate{
    int x , y;
    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class SubtractionofCoordinates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input for the first cordinate
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        // input for the second coordinate
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        Coordinate c1 = new Coordinate(x1,  y1);
        Coordinate c2 = new Coordinate(x2, y2);
        int xDiff = c1.x - c2.x;
        int yDiff = c1.y - c2.y;
        System.out.println(xDiff);
        System.out.println(yDiff);

    }
}
