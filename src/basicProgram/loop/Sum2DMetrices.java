package basicProgram.loop;

public class Sum2DMetrices {
    public static void main(String[] args) {
        int[][] A = {
                {4,8,12},
                {5,10,15}
        };
        int[][] B = {
                {7,14,21},
                {8,16,24}
        };

        int[][] sum = new int[2][3];
        for (int i = 0; i < 2; ++i){
            for (int j = 0; j < 3;  ++j){
                sum[i][j] = A[i][j] + B[i][j];
                System.out.println(sum[i][j]);
            }
        }

    }
}
