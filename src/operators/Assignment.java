package operators;

//see tutorial https://www.programiz.com/java-programming/operators

/*
---------------------------------------------
Assignment operators are used in Java to assign values to variables. For example,

==========
int age;
age = 5;
==========
Here, = is the assignment operator. It assigns the value on its right to the variable on its left.
That is, 5 is assigned to the variable age.

 */
public class Assignment {
    public static void main(String[] args) {
        int a = 4;
        int var;

        //assign value using =
        var = a;
        System.out.println("var using = : " + var);
        //assign value using =+
        var += a;
        System.out.println("var using += : " + var);
        //assign value using =*
        var *=a;
        System.out.println("var using *= : " + var);


    }

}
