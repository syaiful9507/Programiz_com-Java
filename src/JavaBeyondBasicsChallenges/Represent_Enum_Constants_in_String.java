package JavaBeyondBasicsChallenges;

/**
 * Challenge:
 * Represent Enum Constants in String
 * Medium
 * Problem Description
 * Create a program to represent enum constants in string.
 *
 * Create an enum of type OS with constant values WINDOWS, MACOS, LINUX.
 * Inside the Main class create a variable osType of the String type.
 * Assign MACOS constant of OS enum to osType by converting it to string (use toString() method).
 * Print osType.
 * Example
 * Expected Output
 *
 * MACOS
 */


// create enum of type OS
enum OS {
    // add constant values to enum
    WINDOWS, MACOS, LINUX;
}
public class Represent_Enum_Constants_in_String {
    public static void main(String[] args) {

        // create a variable osType
        String osType;

        // convert MACOS to string
        osType = OS.MACOS.toString();

        // print osType
        System.out.println(osType);
    }
}
