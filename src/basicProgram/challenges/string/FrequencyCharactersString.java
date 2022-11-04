package basicProgram.challenges.string;
import java.util.Scanner;
/*
Frequency of Characters in String

Problem Description
Create a program to find the total occurrence of the character 'a' in a basicProgram.string.

- Create a char variable with value 'a'.
- Get basicProgram.string input for the text variable.
- Create a count variable to store the occurrence of character.
- Run a for basicProgram.loop to access each character of the basicProgram.string.
- Inside the basicProgram.loop, access each basicProgram.string character using the charAt() basicProgram.method.
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
