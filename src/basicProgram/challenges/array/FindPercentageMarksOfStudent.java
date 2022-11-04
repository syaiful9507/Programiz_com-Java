package basicProgram.challenges.array;
/*
Find Percentage Marks Of Student

Problem Description
Create a program to find the percentage obtained by a student.

- Create a double basicProgram.array with length 8 to store the marks obtained by the student.
- Get input values for the basicProgram.array.
- Find the sum of all obtained marks.
- Create a totalMarks variable and assign value 800 to it.
- Find the percentage obtained by the student and print it.

Example
Test Input
78
89
82
84
79
88
81
72

Expected Output
81.625
 */
import java.util.Scanner;

public class FindPercentageMarksOfStudent {
    public static void main(String[] args) {

        // create a double basicProgram.array
        double[] marks = new double[8];

        // get input values for obtained marks
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < marks.length; ++i) {
            marks[i] = input.nextDouble();
        }

        // create a variable to store obtainedMarks
        double obtainedMarks = 0.0;

        // find the sum of obtained marks using a basicProgram.loop
        for (int i = 0; i < marks.length ; ++i ){
            obtainedMarks = obtainedMarks + marks[i];
        }

        // create totalMarks variable
        int totalMarks = 800;

        // find the percentage and print it
        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println(percentage);
    }
}
