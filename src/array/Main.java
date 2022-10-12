package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {43, 78, 23, 45};
        int newNumbers[] = new int[numbers.length];

        for (int i = 0; i < numbers.length; ++i){
            newNumbers[i] = numbers[i] * 10;
            System.out.println(newNumbers[i]);
        }


    }
}
