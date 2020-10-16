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
public class Employee {

    protected String name;
    protected String staffNum;
    protected int age;
    

    public Employee() {
        name = " ";
        age = 0;
        staffNum = " ";

    }

    public Employee(String name, String staffNum,int age) {
        this.name = name;
         this.staffNum = staffNum;
         this.age = age;
       
    }

    public String getName() {
        return name;
    }
    public String getStaffNum() {
        return staffNum;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
    }
    public void setAge(int age) {
        this.age = age;
    }




}
