/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/*
 *
 * @author x17140404
 */
public class floorStf extends Employee {

    private double HrRate;

    public floorStf() {
        super();
        HrRate = 0.0;
    }

    public floorStf(double HrRate, String name, int age, String staffNum) {
        super(name, staffNum ,age );
        this.HrRate = HrRate;
    }

    public double getHrRate() {
        return HrRate;
    }

    public void setHrRate(double HrRate) {
        this.HrRate = HrRate;
    }

}
