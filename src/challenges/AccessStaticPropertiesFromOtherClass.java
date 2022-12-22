package challenges;
/*
Challenge:
Access Static Properties from Other Class (Easy)

Problem Description
Create a program to access static fields and methods from other classes.

Step 1:
* Create a class named College with a static field name and static method display().
* Inside the method, print the value of name.

Step 2:
* Create a main() method, inside the Main class.
* Inside the method, get a string input from the user and assign it to the inputName variable.
* Assign the value of user input to the static field.
* Call the static method display() using its class name.

Example
Test Input
MIT

Expected Output
MIT

 */

import java.util.Scanner;

class College {
    static String name;
    static void display(){
        System.out.println(name);
    }
}
public class AccessStaticPropertiesFromOtherClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputName = in.nextLine();
        College.name = inputName;
        College.display();
        in.close();

    }
}
