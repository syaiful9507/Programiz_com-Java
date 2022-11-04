package basicProgram.method;

import java.util.Scanner;

public class Main {
    int getProduct(int number1, int number2){
        int result = number1 * number2;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan number product 1 : ");
        int n1 = in.nextInt();
        System.out.print("Masukkan number product 2 : ");
        int n2 = in.nextInt();

        Main obj = new Main();
        int result = obj.getProduct(n1, n2);
        System.out.println(result);
    }
}
