package javaBeyondBasics.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
/*
Access Elements from LinkedList - Medium

Problem Description
Create a program to access an element from a LinkedList.

* Import java.util.LinkedList.
* Import java.util.Scanner.
* Declare a new String LinkedList called languages.
* Add strings Java and Python to languages using add().
* Take an int input from the user and store it in index variable.
* Access the element at index and store it in element variable of String type.
* Print element.
* We will assume that the user will only enter index 0 and 1.

Example
Test Input
0

Expected Output
Java
 */
public class AccessElementsfromLinkedList {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        String element = languages.get(index);
        System.out.print(element);
    }
}
