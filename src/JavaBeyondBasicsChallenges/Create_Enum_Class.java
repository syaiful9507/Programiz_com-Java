package JavaBeyondBasicsChallenges;

/**
 * Challenge:
 * Create Enum Class
 * Medium
 * Problem Description
 * Create a program to create enum class.
 *
 * Create an enum of type Size.
 * Add constants SMALL, MEDIUM, LARGE, and EXTRA_LARGE.
 * Inside the enum, create a method named getSize() of String type.
 * Inside the method create a switch case and return small, medium, large, extra large for Case SMALL, MEDIUM, LARGE, and EXTRA_LARGE respectively.
 * Inside the Main class print "Your card is: " + Size.MEDIUM.getSize().
 * Example
 * Expected Output
 *
 * Your card is: medium
 */
enum Size {
    // add enum constants
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;
    // create a method
    public String getSize() {
        // this refers to current object
        switch (this) {
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";
            case EXTRA_LARGE:
                return "extra large";
            default:
                return "nothing";
        }
    }
}
public class Create_Enum_Class {
    public static void main(String[] args) {
        // print "Your card is: " + Size.MEDIUM.getSize()
        System.out.println("Your card is: " + Size.MEDIUM.getSize());
    }
}
