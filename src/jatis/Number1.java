package jatis;

public class Number1 {
    public static void main(String[] args) {
        int a = 50, b = 63; //output a = 63 dan b = 50;
        System.out.println("sebelum dibalik " + " a : " + a + " b : " + b);
        a = a + b; //50 + 63 = 113;
        b = a - b; // 113 - 63 = 50 -> b = 50;
        a = a - b; // 113 - 50 = 63; -> a = 63;
        System.out.println("setelah dibalik " + " a : " + a + " b : " + b);

    }
}
