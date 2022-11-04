package basicProgram.challenges.method;

import java.util.Scanner;

public class CheckPrimeNumber {
    void checkPrime(int number){
        int flag  = 0;
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0){
                flag++;
            }
        }
        if (flag == 1){
            System.out.println("Prime Number ");
        } else {
            System.out.println("Not a Prime Number");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        do {
            number = in.nextInt();
            CheckPrimeNumber obj =new CheckPrimeNumber();
            obj.checkPrime(number);
        } while (true);


    }

}
