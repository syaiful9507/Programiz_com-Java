package loop.challenges;

import java.util.Scanner;

public class IntervalAnglesTriagle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int sumxyz = x + y + z;
        String rs = (sumxyz == 180 ) ? "true" : "false";
        System.out.print(rs);
    }
}
