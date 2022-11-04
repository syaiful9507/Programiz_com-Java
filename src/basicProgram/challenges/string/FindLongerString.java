package basicProgram.challenges.string;

import java.util.Scanner;

public class FindLongerString {
    String countString(String txt1, String txt2){
        String countStr = (txt1.length() > txt2.length()) ? txt1 : txt2;
        return countStr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text1 = in.nextLine();
        String text2 = in.nextLine();
        FindLongerString objStr = new FindLongerString();
        String resultString = objStr.countString(text1, text2);
        System.out.println(resultString);
    }
}
