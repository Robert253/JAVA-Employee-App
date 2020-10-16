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
public class EmployeeApp {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("Robert");
        e1.setAge(22);
        e1.setStaffNum("x23564");

        System.out.println("E1" + e1.getName() + ", " + e1.getAge() + ", " + e1.getStaffNum());
//String name, String staffNum,int age
        Employee e2 = new Employee("John", "x12356 ", 26);
        System.out.println("E2:" + e2.getName() + ", " + e2.getAge() + ", " + e2.getStaffNum()
        );

        Manager m1 = new Manager();
        m1.setName("Rob");
        m1.setAge(65);
        m1.setStaffNum("X654789");
        m1.setSalary(20000);
        
        Manager m2 = new Manager();
        m2.setName("Dave");
        m2.setAge(89);
        m2.setStaffNum("X565465");
        m2.setSalary(30000);

    }

}
