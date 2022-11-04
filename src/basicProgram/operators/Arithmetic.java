package basicProgram.operators;

import java.util.Scanner;

//see tutorial https://www.programiz.com/java-programming/operators
public class Arithmetic {
    public static void main(String[] args) {
        //declare Variables
        int a = 12, b = 5;
        double c = 6.0;
        //addition operator
        System.out.println("a + b = " + (a + b));
        //subtraction operator
        System.out.println("a - b = " + (a - b));
        //multiplication operator
        System.out.println("a * b = " + (a * b));
        //devision operator
        System.out.println("a / b = " + (a / c));
        //modulo operator
        System.out.println("a % b = " + (a % b));

        System.out.println("=========================");
        double fee = 1536, discountPercent = 10;
        //compute discount amount
        double discount = fee * (discountPercent/100);
        double finalFee = fee - discount;
        System.out.println(discount);
        System.out.println(finalFee);

        System.out.println("========== INPUT SCANNER ===========");
        System.out.print("Masukkan celsius : ");
        Scanner input = new Scanner(System.in);
        Double celsius = input.nextDouble();
        double fahrenheit = (celsius * 1.8) + 13;

        System.out.println("Fahrenheit is : " + (fahrenheit));
        input.close();



        /*
        -----------------------------------------------------------------------

        / Division Operator
        Note the operation, a / b in our program. The / operator is the division operator.
        If we use the division operator with two integers, then the resulting quotient will also be an integer.
        And, if one of the operands is a floating-point number,
        we will get the result will also be in floating-point.

        In Java,
        (9 / 2) is 4
        (9.0 / 2) is 4.5
        (9 / 2.0) is 4.5
        (9.0 / 2.0) is 4.5


        ------------------------------------------
        % Modulo Operator
        The modulo operator % computes the remainder. When a = 7 is divided by b = 4,
        the remainder is 3.
        Note: The % operator is mainly used with integers.
         */



    }
}
