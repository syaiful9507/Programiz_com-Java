package oop.constructors;

import java.util.Scanner;
//telekomunikasi
//
public class Student {
    int score;
    char grade;
    Student(int score){
        this.score = score;
    }
    void assignGrade(){
        if (this.score >=  90){
            this.grade = 'A';
        } else if (this.score >= 80){
            this.grade = 'B';
        } else {
            this.grade = 'C';
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        Student student = new Student(score);
        student.assignGrade();
        System.out.println(student.grade);
    }
}
