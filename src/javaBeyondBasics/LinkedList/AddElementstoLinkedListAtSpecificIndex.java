package javaBeyondBasics.LinkedList;
import java.util.LinkedList;
import java.util.Scanner;
/*
Add Elements to LinkedList At Specific Index
Easy
Problem Description
Create a program to add elements to linkedlist at specific index.

* Import java.util.LinkedList.
* Import import java.util.Scanner.
* Declare a new String LinkedList called languages.
* Add strings Java and Python to languages using add().
* Take a String input from the user and store it in language1.
* Add string language1 at index 1 of languages.
* Print languages.

#Example
Test Input
C++

#Expected Output
[Java, C++, Python]

 */
public class AddElementstoLinkedListAtSpecificIndex {
    public static void main(String[] args) {
        LinkedList<String> languanges = new LinkedList<>();
        languanges.add("Java");
        languanges.add("Python");
        Scanner in = new Scanner(System.in);
        String languange1 = in.nextLine();

        languanges.add(1, languange1);
        System.out.print(languanges);

    }
}
