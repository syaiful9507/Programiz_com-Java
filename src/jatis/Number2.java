package jatis;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String text = in.nextLine();
        String text = "jatis";
        for (int i = text.length() - 1; i >= 0 ; --i) {
            System.out.print(text.charAt(i));
        }
    }
}
