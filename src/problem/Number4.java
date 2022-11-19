package problem;

public class Number4 {
    public static void main(String[] args) {
        int primeFlag = 0;
        int multipleFlag = 0;

        for (int i = 1; i <= 100 ; i++) {
            for (int j = 2; j <= i ; j++) {
                //System.out.println(i  + " % " + j + " = " + (i%j));
                if (i % j == 0) {
                    primeFlag++;
                }
                //if ()
            }
                //System.out.println("iterasi " + i + " flag : " + flag);
            if (primeFlag == 1){
                System.out.println("Bilangan Prima : " + i);
            }
            primeFlag = 0;
            if (i % 9 == 0){
                System.out.println("Kelipatan 9 ke : " + i);
            }
        }
        //System.out.println(flag);
    }
}
