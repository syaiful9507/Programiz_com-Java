package oopAdvance;

import java.util.Scanner;
/*
Challenge:
Employee Salary using Encapsulation
Hard
Problem Description
Create a program to access and modify the salary of an employee using encapsulation.

Step 1:
* Create a class named Employee with a private field salary.
* Create a public setter method to set the salary of the employee.
* Create a public getter method to get the salary of the employee.

Step 2:
* Create main() method, inside Main class.
* Get a double input for the salary variable.
* Create an object of the Employe class.
* Call the setter method with the salary argument.
* Call the getter method and print the result.

Example
Test Input
145323.9

Expected Output
145323.9
 */
class Employee {
    private double salary;
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }

}
public class EmployeeSalaryusingEncapsulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salary = in.nextDouble();
        Employee employee = new Employee();
        employee.setSalary(salary);
        salary = employee.getSalary();
        System.out.println(salary);

    }
}
