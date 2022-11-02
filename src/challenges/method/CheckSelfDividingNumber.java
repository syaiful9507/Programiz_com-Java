package challenges.method;

import java.util.Scanner;

public class CheckSelfDividingNumber {
    void checkSelfDevide1(int number){
        int reminder, digit = 0, flag = 0;
        int num = number;
        while (num != 0){
            reminder = num % 10;
            digit = digit + 1;
            num = num / 10;
            //int devide = number % reminder;
            if (number % reminder == 0){
                flag++;
            }
        }
        if (digit == flag){
            System.out.println("Self Dividing Number");
        } else {
            System.out.println("Not a Self Dividing Number");
        }
    }

    boolean checkSelfDivide2(int number){
        int num = number;
        int digit;

        while (num != 0){
            digit = num % 10;
            //if it doesn't devide th number
            if (number % digit != 0){
                return false;
            }
            num = num / 10;
        }
        //if all gigit devide number
        return  true;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number : ");
        int number = in.nextInt();
        System.out.print("Select Algoritm Startegy ( 1 or 2) : ");
        int algo = in.nextInt();
        //object
        CheckSelfDividingNumber obj = new CheckSelfDividingNumber();

        if (algo == 1) {
            System.out.println("ALGO 1");
            boolean result = obj.checkSelfDivide2(number);
            if (result){
                System.out.println("Self Dividing Number");
            } else {
                System.out.println("Not a Self Dividing Number");
            }
        } else {
            obj.checkSelfDevide1(number);
        }

    }
}
