package challenges.string;

import java.util.Scanner;

/*
Number of Vowels in String

Problem Description
Create a program to count the number of vowels present in a string.

- Get a string input for the text variable.
- Convert the input value to lowercase for simplicity.
- Create an integer variable vowels with initial value 0.
- Run a for loop to access each character of the string.
- Compare each character with the 5 lowercase vowels.
- If there is a match, increase the value of vowels by 1.
- Print vowels.

Example
Test Input
programiz
Expected Output
3
 */
public class NumberVowelsString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vowels = "aiueo";
        int count = 0;
        String text = in.nextLine();
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (text.charAt(i) == vowels.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
