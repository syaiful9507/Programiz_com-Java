package loop;

public class Sepeda {
    public static void main(String[] args) {
        int number = 20;
        String text = "SEPEDA";
        int lg = text.length();
        int rs = number - lg; // rs = 20 - 6 = 14 - initial
        int i = 0;

        System.out.println(lg);
        for (i = i; i < lg; i++) {
            System.out.print(text.charAt(i));
            //System.out.println(" ini value i : " + i);
            // rs = number - i;  # 1. rs = 20 - 5 = 15 |  # 2. rs = 9 - 6 = 2
            if ((i == lg - 1) && (rs > lg)){ // 14 > 6 -> 8 > 6
                System.out.print(" <-- Bagian i ");
                for (int j = 0; j < lg ; j++) {
                    System.out.print(text.charAt(j));
                    //System.out.println(" ini value i setelah j : " + i);
                }
                //System.out.print(" <-- Bagian j " + rs + " ");
                rs = rs - lg; // 14 - 6 = 8
                //lg = rs;


            } else if (rs <= lg ) {
                //System.out.print(" <-- Bagian i ");
                lg = rs;
                //i  = -1;
                for (int k = 0; k < lg; k++) {
                    System.out.print(text.charAt(k));
                    //System.out.println(" ini value i setelah k : " + i);
                }
                //System.out.print(" <-- Bagian k ");
                break;

            }
        }
    }
}
