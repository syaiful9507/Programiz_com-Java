package loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        double sum = 0;
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Number : ");
            double number = input.nextDouble();
            if (number == 0){
                break;
            } else {
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}
