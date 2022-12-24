package javaBeyondBasics.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
/*
Challenge:
Modify Elements of an ArrayList
Medium

Problem Description
Create a program to modify elements of an ArrayList.

* Import java.util.ArrayList.
* Declare a new String ArrayList called names.
* Add strings Jeremy, Jules, and Howard to names using add().
* Take String input from the user and store it in name1 variable.
* Using the set() method to replace the value in index 1 with name1.
* Print names.

Example
Test Input
Harry

Expected Output
[Jeremy, Harry, Howard]

 */
public class ModifyElementsArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");
        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine();
        names.set(1, name1);
        System.out.println(names);
    }
}
