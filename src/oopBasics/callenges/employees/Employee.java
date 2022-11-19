package oopBasics.callenges.employees;

public class Employee {
    String name;
    double currentSalary;
    private double newSalary;

    Employee(String name, double currentSalary)
    {
        this.name = name;
        this.currentSalary = currentSalary;
    }

    public void setNewSalary(double percentage)
    {
        this.newSalary = this.currentSalary + (this.currentSalary * (percentage /100.0));
    }

    double getNewSalary()
    {
        return this.newSalary;
    }


}
