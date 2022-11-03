package challenges.string;

import java.util.Scanner;

public class CheckTwoStringsEqual {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text1, text2;
        text1 = in.nextLine();
        text2 = in.nextLine();
        if (text1.equals(text2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }


}
