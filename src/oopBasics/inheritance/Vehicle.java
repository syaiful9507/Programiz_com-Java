package oopBasics.inheritance;

public class Vehicle {

    void getFeature(){
        System.out.println("Initializing vehicle features");
    }
}

class Car extends  Vehicle{

}
class Main{
    public static void main(String[] args) {
        Car car = new Car();
        car.getFeature();
    }
}
