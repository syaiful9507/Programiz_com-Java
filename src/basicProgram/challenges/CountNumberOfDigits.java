package basicProgram.challenges;
/*
Problem Description
- Create a program to count the number of digits in an integer.
- Get an integer input for the number variable.
- Create an integer variable count with value 0.
- Use a basicProgram.loop to iterate until number is not equal to 0.
- Remove the last digit from number in each iteration.
- Increase count by 1 in each iteration.
Hint: Divide number by 10 during each iteration of the basicProgram.loop to remove a digit.

Example
Test Input
123
Expected Output
3

code




 */
public class CountNumberOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int count = 0;
        for (number = number; number >= 0; number--){
            number = number / 10;
            count = count+1;
            System.out.println("num : " + number);
            System.out.println("count :" + count);
        }
        System.out.println(count);
    }
}
