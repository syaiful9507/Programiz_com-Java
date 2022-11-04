package basicProgram.challenges;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        /* Testing
        int number = 12;
        int sum = 0;

        for (int i = 1; i < number ; i++) {
            if (number % i == 0){
                System.out.print(" " + i + " ");
                sum = sum + i;
            }
        }
        System.out.println("= " + sum);
         */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // variable to store the sum of all divisors
        int sum = 0;

        // run basicProgram.loop to find the divisor of number
        for (int i = 1; i < number; ++i) {

            // check if i is divisor of number
            if (number % i == 0) {
                // if true, add i to sum
                sum = sum + i;
            }
        }

        // check if sum is greater than number
        if (sum > number) {
            System.out.println("Abundant Number");
        }
        else {
            System.out.println("Not an Abundant Number");
        }

        input.close();

    }
}
