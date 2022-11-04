package basicProgram.challenges.array;

import java.util.Scanner;

public class MeanHeightPlayers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < heights.length ; i++) {
            heights[i] = in.nextDouble();
            sum = sum + heights[i];
        }
        mean = sum / heights.length;
        System.out.println(mean);
    }

}
