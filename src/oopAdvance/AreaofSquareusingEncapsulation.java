package oopAdvance;

import java.util.Scanner;

class Squaree {
    private int length;

    public void setLength(int length){
        if (length > 0)
            this.length = length;
        else
            System.out.println("Length of a square cannot be less than 0");
    }

    void calculateArea(){
        int result = length * length;
        System.out.println(result);
    }
}
public class AreaofSquareusingEncapsulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        Squaree squaree = new Squaree();
        squaree.setLength(length);
        squaree.calculateArea();
    }
}
