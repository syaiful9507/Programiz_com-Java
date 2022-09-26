package operators;
/*
Increment and Decrement Operators
Java also provides increment and decrement operators: ++ and -- respectively.
++ increases the value of the operand by 1, while -- decrease it by 1. For example,
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        //declare variables
        int a = 12, b = 12;
        int result1, result2;

        //original value
        System.out.println("Value of a : " + a);

        //increment operator
        result1 = ++a;
        System.out.println("After Increment : " + result1);

        System.out.println("Value of b : " + 12);

        //decrement operator
        result2 = --b;
        System.out.println("After Decrement : " + result2);



    }
}
