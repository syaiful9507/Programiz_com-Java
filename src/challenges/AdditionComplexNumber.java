package challenges;
/*
Challenge:
Addition of Complex Number (level Medium)

Problem Description
Create a program to add complex numbers.

Complex numbers are expressed in the form of 5 + 8i, where 5 is the real part and 8i is the imaginary part.

Step 1:
* Create a class named ComplexNumber with two double fields real and imag.
* Create a constructor with double parameters real and imag.
* Inside the constructor, initialize the value of fields real and imag using the this keyword.

Step 2:
* Create the main() method inside a Main class.
* Get 4 double inputs for variables n1, n2 for the first Complex number and n3, n4 for the second complex number.
* Create an object c1 of the ComplexNumber class with arguments n1 and n2.
* Create another object c2 of ComplexNumber with arguments n3 and n4.
* Add real fields of both objects c1 and c2 and store it in the realSum variable.
* Add imag fields of both objects c1 and c2 and store it in the imagSum variable.
* Print the sum in format realSum + imagSum i.

Example

Test Input
8
2.4
6
4.2

Expected Output
14.0 + 6.6i

 */
import java.util.Scanner;

class ComplexNumber{
    double real;
    double imag;

    ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
}
public class AdditionComplexNumber {
    public static void main(String[] args) {
        // get 4 input values
        Scanner input = new Scanner(System.in);

        // input for the first complex number
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        // input for the second complex number
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();

        // create c1 object of ComplexNumber with arguments n1 and n2
        ComplexNumber c1 = new ComplexNumber(n1,n2);

        // create c2 object of ComplexNumber with arguments n3 and n4
        ComplexNumber c2 = new ComplexNumber(n3,n4);

        // add real part of c1 and c2
        double realSum = c1.real + c2.real;

        // add imag part of c1 and c2
        double imagSum = c1.imag + c2.imag;
        System.out.println((realSum) + " + " + imagSum +"i");
    }
}
