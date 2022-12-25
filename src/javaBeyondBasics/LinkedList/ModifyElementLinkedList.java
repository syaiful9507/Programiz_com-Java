package javaBeyondBasics.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
/*
Challenge:
Modify Elements of an LinkedList - Medium

Problem Description
Create a program to modify elements of an linkedlist.

* Import java.util.LinkedList.
* Declare a new String LinkedList called names.
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
public class ModifyElementLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // add Jeremy, Jules & Howard
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");

        // take input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();

        // replace the value in index 1 with name1
        names.set(1, name1);

        // print names
        System.out.println(names);

        input.close();
    }
}
