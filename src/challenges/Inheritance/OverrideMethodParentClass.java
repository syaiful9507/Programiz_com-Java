package challenges.Inheritance;
class questionOverride {
/*
Override Method of Parent Class
Easy
Problem Description
Create a program to override the method of parent class.

Step 1:
* Create a class named Vehicle with a displayInfo() method.
* Inside the method, print Four Wheeler or Two Wheeler.
* Create another class named Car that inherits from Vehicle.
* Inside the class, override the displayInfo() method and print Cars are Four Wheeler.

Step 2:
* Create the main() method inside a Main class.
* Inside the method, create an object of Car and call the displayInfo() method.

Example
Expected Output
Cars are Four Wheeler
 */
}
class Vehicle {
    void displayInfo(){
        System.out.println("Four Wheeler or Two Wheeler");
    }
}
class Car extends Vehicle {
    @Override
    void displayInfo() {
        System.out.println("Cars are Four Wheeler");
    }
}
public class OverrideMethodParentClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayInfo();
    }
}
