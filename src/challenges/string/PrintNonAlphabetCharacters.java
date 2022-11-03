package challenges.string;

import java.util.Scanner;

public class PrintNonAlphabetCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char x = text.charAt(i);
            if ((x >= 'a')  && x <= 'z'){
                continue;
            }
            System.out.println(x);
        }
    }
}
