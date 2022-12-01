package oopBasics.callenges.employees;
/*
Get and Set salary of Employee

#Problem Description
Suppose a company increases the salary of every employee by a certain percentage.
Create a program to calculate the salary of employees after the increment.

#Thought Process
Here, we need to create an Employee class with three fields: name, currentSalary, and newSalary.
Since the company increases the salary by a certain percentage, we need to make the newSalary private,
so that it cannot be modified randomly from outside of the class.

We will then use setter and getter methods to increase the salary
by the specified percentage and return the increased salary.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Felix", 25213.53);
        //increase salary by 20%
        employee.setNewSalary(20.00);
        double newSalary = employee.getNewSalary();
        System.out.println("Name : " + employee.name + "\nNew Salary : " + newSalary);

        Employee employee1 = new Employee("Maria", 873223.32);
        //increase salary by 15.3%
        employee1.setNewSalary(15.37);
        newSalary = employee1.getNewSalary();
        System.out.println("Name : " + employee1.name + "\nNew Salary : " + newSalary);


    }
}
