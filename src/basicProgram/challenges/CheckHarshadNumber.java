package basicProgram.challenges;

import java.util.Scanner;

public class CheckHarshadNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int digit, sum = 0;
        int num = number;
        while (num !=0){
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        String hn = (number % sum == 0) ? "Harshad Number" : "Not a Harshad Number";
        System.out.println(hn);
    }
}
