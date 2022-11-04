package basicProgram.challenges.string;

import java.util.Scanner;

public class ConvertFirstLetterToUppercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.toLowerCase();

        String firstToUp = text.substring(0,1).toUpperCase();
        String remainingText = text.substring(1, text.length());
        //System.out.println(firstToUp);

        System.out.println(firstToUp.concat(remainingText));
    }


}
