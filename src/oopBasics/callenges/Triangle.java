package oopBasics.callenges;

public class Triangle {
    int base, height;
    //membuat default value dari constructor
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    //calculate area triangle
    double computeAreaTriangle(){
        double area = 0.5 * (this.base * this.height);
        return area;
    }
}
