package challenges.string;
import java.util.Scanner;
/*
Frequency of Characters in String

Problem Description
Create a program to find the total occurrence of the character 'a' in a string.

- Create a char variable with value 'a'.
- Get string input for the text variable.
- Create a count variable to store the occurrence of character.
- Run a for loop to access each character of the string.
- Inside the loop, access each string character using the charAt() method.
- Compare the character with the given character.
- If there is a match, increase the value of count by 1.
- Finally print the count.

Example
Test Input
Java

Expected Output
2
 */
public class FrequencyCharactersString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text1 = in.nextLine();
        char text2 = 'a';
        int count = 0;
        for (int i = 0; i < text1.length() ; i++) {
            if (text1.charAt(i) == text2){
                count++;
            }
        }
        System.out.println(count);
    }


}
