package basicProgram.challenges.method;

import java.util.Scanner;

public class CheckPolindromeNumber {
    int findReversed(int number){
        int reminder, reversed = 0;
        while (number != 0){
            reminder = number % 10;
            reversed = (reversed * 10) + reminder;
            number = number / 10;
        }
        return reversed;
    }

    String checkPolindrome(int number, int reversed){
        String polindrome;
        polindrome = (number == reversed) ? "Palindrome Number" : "Not a Palindrome Number";
       return  polindrome;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        CheckPolindromeNumber obj = new CheckPolindromeNumber();
        int reversed = obj.findReversed(number);
        String result = obj.checkPolindrome(number, reversed);
        System.out.println(result);

    }
}
