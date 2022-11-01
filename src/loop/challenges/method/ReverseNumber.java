package loop.challenges.method;

import java.util.Scanner;

public class ReverseNumber {
    int findReverse(int number ){
        int reversed = 0;
        int reminder;
        while (number != 0){
            reminder = number % 10;
            reversed = (reversed * 10) + reminder;
            number = number / 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        ReverseNumber objRN = new ReverseNumber();
        int result = objRN.findReverse(number);
        System.out.println(result);
    }
}
