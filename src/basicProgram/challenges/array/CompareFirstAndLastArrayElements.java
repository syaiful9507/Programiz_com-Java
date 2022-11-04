package basicProgram.challenges.array;

import java.util.Scanner;

public class CompareFirstAndLastArrayElements {
    public static void main(String[] args) {
        int ar[] = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < ar.length ; i++) {
            ar[i] = in.nextInt();
        }

        int first = ar[0];
        int last = ar[ar.length -1];

        if (first == last) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
