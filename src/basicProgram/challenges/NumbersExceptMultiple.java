package basicProgram.challenges;

public class NumbersExceptMultiple {
    /*
    Problem Description
    Create a program to print all numbers from 0 to 10 except the multiples of 3.
    - Run a for basicProgram.loop from i = 1 to i <= 10.
    - Check if i is perfectly divisible by 3.
    - If i is divisible by 3, skip the basicProgram.loop and go to the next iteration. Otherwise, print the value of i.

    * Example
    Expected Output
    1
    2
    4
    5
    7
    8
    10
    */
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
