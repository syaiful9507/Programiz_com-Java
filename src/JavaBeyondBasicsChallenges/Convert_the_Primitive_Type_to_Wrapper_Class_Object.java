package JavaBeyondBasicsChallenges;

/**
 * Challenge:
 * Convert the Primitive Type to Wrapper Class Object
 * Easy
 * Problem Description
 * Create a program to convert the primitive type into their corresponding wrapper class object.
 *
 * Create a char variable named x and assign 'c' to it.
 * Convert x to Character by assigning x to xObj of Character type.
 * Print xObj.
 * Example
 * Expected Output
 *
 * c
 */
public class Convert_the_Primitive_Type_to_Wrapper_Class_Object {
    public static void main(String[] args) {
        char x = 'c';

        // convert the primitive type into object
        Character xObj = x;

        // print xObj
        System.out.println(xObj);
    }
}
