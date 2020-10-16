/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author x17140404
 */
public class Manager extends Employee {

    private double salary;

    public Manager() {
        super();
        salary = 0.0;
    }

    public Manager(double salary, String name, String staffNum,int age) {
        super(name, staffNum ,age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
