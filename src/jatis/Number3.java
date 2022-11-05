package jatis;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Text : ");
        String text = in.nextLine();
        String temp = String.valueOf(text.charAt(0));
        int flage = 0;

        for (int i = 1; i < text.length(); i++) {
            for (int j = 0; j < temp.length(); j++) {
                if (text.charAt(i) == temp.charAt(j)){
                    flage++;
                    break;
                } else if (j == temp.length() -1 && flage == 0){
                    temp = temp.concat(String.valueOf(text.charAt(i)));
                    break;
                }
            }
            flage = 0;
        }

        temp = temp.replaceAll("\\s", "");
        text = text.replaceAll("\\s", "");
        int count = 0;
        for (int i = 0; i < temp.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if (temp.charAt(i) == text.charAt(j)){
                    count++;
                }
            }
            if (count > 1){
                System.out.print(count);
                System.out.print(temp.charAt(i));
            } else {
                System.out.print(temp.charAt(i));
            }
            count = 0;
        }

        

    }
}
