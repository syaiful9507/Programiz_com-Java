package challenges.method;

import java.util.Scanner;

public class GCDTwoNumbers {
    int findGCD(int num1, int num2){
        int gdc = 1;
        for (int i = 1; i < num1 || i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gdc = i;
            }
        }
        return gdc;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        GCDTwoNumbers objGCD = new GCDTwoNumbers();
        int result = objGCD.findGCD(number1, number2);
        System.out.println(result);
    }
}
