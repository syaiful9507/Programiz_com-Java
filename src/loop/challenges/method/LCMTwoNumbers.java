package loop.challenges.method;

import java.util.Scanner;

public class LCMTwoNumbers {
    int findLCM(int num1, int num2){
        int small = (num1 < num2) ? num1 : num2;
        int lcm = small;
        while (true){
            if (lcm % num1 == 0 && lcm % num2 == 0){
                lcm = lcm;
                break;
            }
            lcm++;
        }
        //return lcm;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        LCMTwoNumbers objLCM = new LCMTwoNumbers();
        int result = objLCM.findLCM(number1, number2);
        System.out.println(result);
    }
}
