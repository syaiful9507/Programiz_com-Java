package challenges;
/*
Challenge:
Access Static Properties within Class (Easy)

Problem Description
#Create a program to access the static field and method within the class.
* Create a class named College with a static field name and static method display().
* Inside the method, print the value of name.
* Create a main() method.
* Inside the method, get a string input from the user and assign it to the inputName variable.
* Initialize the static field name with the value inputName.
* Call the static method display().

Example
Test Input
MIT

Expected Output
MIT
 */

import java.util.Scanner;

public class AccessStaticPropertiesWithinClass {
    static String name;
    static void display(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputName = in.nextLine();
        name = inputName;
        display();

    }
}
