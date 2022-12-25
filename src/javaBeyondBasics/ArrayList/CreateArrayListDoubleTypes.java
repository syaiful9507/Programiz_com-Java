package javaBeyondBasics.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateArrayListDoubleTypes {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        double num;
        for (int i = 0; i < 4 ; i++) {
            num = in.nextDouble();
            numbers.add(num);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
