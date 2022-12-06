package challenges.Inheritance;

import java.util.Scanner;

class questionOverrideMultiple{
/*
Override Method in Multiple Classes
Easy
Problem Description
Create a program to override the same method in multiple classes.

Step 1:
* Create a class named Animal with a method named display().
* Inside the method, print I am an animal.
* Inherit two classes named Dog and Cat from the same Animal class.
* Inside Dog, override display() to print I am a dog.
* Inside Cat, override display() to print I am a cat.

Step 2:
* Create the main() method inside a Main class.
* Inside the method, create objects of both Dog and Cat classes.
* Call the display() method using the objects of both classes.

Example
Expected Output
I am a dog
I am a cat

 */
}

class Animal {
    void display(){
        System.out.println("I am an animal");
    }
    void eat(){
        System.out.println("I eat animal food");
    }
}
class Mammal extends Animal {
    @Override
    void display() {
        System.out.println("I am a mammal");
    }
}
class Dog extends Mammal {
    @Override
    void display() {
        super.display();
        System.out.println("I am a dog");
    }

    @Override
    void eat() {
        super.eat();
    }

    void displayName(String name){
        System.out.println(name);
    }
}
class Cat extends Animal {
    @Override
    void display() {
        System.out.println("I am a cat");
    }
}
public class OverrideMethodMultipleClasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.display();
        cat.display();
        dog.displayName(name);
        dog.display();
        dog.eat();

    }
}
