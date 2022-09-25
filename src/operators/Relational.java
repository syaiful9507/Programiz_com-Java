package operators;
//see tutorial https://www.programiz.com/java-programming/operators

/*
------------------------------------------------------
Relational operators are used to check the relationship between two operands. For example,

// check if a is less than b
=======
a < b;
=======
 */
public class Relational {
    public static void main(String[] args) {
        //create variables
        int a = 7, b = 11;

        //value of a and b\
        System.out.println("a is : " + a + " and b is " + b);

        // == operator
        System.out.println(a == b); //false
        // != operator
        System.out.println(a != b); //true
        // > operator
        System.out.println(a > b); //false
        // < operator
        System.out.println(a < b); //true
        // => operator
        System.out.println(a >= b); //false
        // <= operator
        System.out.println(a <= b); //true

        /*
        Note: Relational operators are used in decision making and loops.
         */
    }
}
