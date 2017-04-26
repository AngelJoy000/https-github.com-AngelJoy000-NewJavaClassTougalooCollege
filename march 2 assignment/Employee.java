/**
 * @(#)Employee.java
 *
 *
 * @author 
 * @version 1.00 2017/3/2
 */


public class Employee {
    private int empId;
    private double hourlyRate;
    private int noOfHoursWorked;
    private double wages;

    //Getters and setters
    public Employee(int empId, double hourlyRate, int noOfHoursWorked)
    {
        this.empId = empId;
        this.hourlyRate = hourlyRate;
        this.noOfHoursWorked = noOfHoursWorked;
        this.wages = hourlyRate*noOfHoursWorked;
    }

    public void printPayroll()
    {
//        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println(empId+"    "+"$"+(wages));
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNoOfHoursWorked() {
        return noOfHoursWorked;
    }

    public void setNoOfHoursWorked(int noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }
}