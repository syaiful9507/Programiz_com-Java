package loop;

public class Sepeda {
    public static void main(String[] args) {
        int number = 20;
        String text = "SEPEDA";
        int lg = text.length();
        int rs = 0;
        int i = 0;

        System.out.println(lg);
        for (i = i; i < lg; i++) {
            System.out.print(text.charAt(i));
            rs = number - lg;
            if (i == 5 && lg < rs){
                lg = lg;
                i = -1;
                for (int j = 0; j < lg ; j++) {
                    System.out.print(text.charAt(j));
                }
            } else if ( i == 5 && lg > rs) {
                lg = rs;
                i  = -1;
                for (int j = 0; j < lg; j++) {
                    System.out.print(text.charAt(j));
                }
            }
        }
    }
}
