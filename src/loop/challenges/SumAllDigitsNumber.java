package loop.challenges;

import java.util.Scanner;

public class SumAllDigitsNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int num = number;
        int digit = 0;
        int sum = 0;
        while (num != 0) {

            // use num % 10 to find each digit of number
            num = num % 10;

            // add each digit to sum
            sum = sum + num;

            // remove last digit from number
            num = number / 10;
            digit++;
        }

        // print the sum
        System.out.println(sum);


    }
}
