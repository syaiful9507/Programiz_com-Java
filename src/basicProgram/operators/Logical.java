package basicProgram.operators;
/*
Logical basicProgram.operators are used to check whether an expression is true or false.
They are used in decision making.
 */
public class Logical {
    public static void main(String[] args) {
        // && operator
        System.out.println( (5 > 3) && (8 > 5)); //true
        System.out.println( (5 > 3) && (8 < 5)); //false

        // || operator
        System.out.println( (5 < 3) || (8 > 5)); //true
        System.out.println( (5 > 3) || (8 < 5)); //true
        System.out.println( (5 < 3) || (8 < 5)); //false

        // !operator
        System.out.println( !(5 == 3) ); //true
        System.out.println( !(5 > 3)); //false

        /*

        -------------------------------------------------------------
        Working of Program

        (5 > 3) && (8 > 5) returns true because both (5 > 3) and (8 > 5) are true.
        (5 > 3) && (8 < 5) returns false because the expression (8 < 5) is false.
        (5 < 3) || (8 > 5) returns true because the expression (8 > 5) is true.
        (5 > 3) || (8 < 5) returns true because the expression (5 > 3) is true.
        (5 < 3) || (8 < 5) returns false because both (5 < 3) and (8 < 5) are false.
        !(5 == 3) returns true because 5 == 3 is false.
        !(5 > 3) returns false because 5 > 3 is true.

         */





    }
}
