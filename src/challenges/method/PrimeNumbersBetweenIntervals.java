package challenges.method;

import java.util.Scanner;

public class PrimeNumbersBetweenIntervals {
    int checkPrime(int number) {
        int flag = 0;
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0 ){
                flag++;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        PrimeNumbersBetweenIntervals obj = new PrimeNumbersBetweenIntervals();

        for (int i = x; i <= y; i++) {
            int prime = obj.checkPrime(i);
            if (prime == 1){
                System.out.println(i);
            }
        }
    }
}
