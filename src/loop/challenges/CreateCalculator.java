package loop.challenges;

import java.util.Scanner;

public class CreateCalculator {
    public static void main(String[] args) {
        double first = 10, second = 5;
        char op = '_';
        double result;

        switch (op){
            case '+' :
                result = first + second;
                System.out.println(result);
                break;
            case '-' :
                result = first - second;
                System.out.println(result);
                break;
            case '*' :
                result = first * second;
                System.out.println(result);
                break;
            case '/' :
                result = first / second;
                System.out.println(result);
                break;
            default :
                System.out.println("Invalid");
                break;
        }

    }
}
