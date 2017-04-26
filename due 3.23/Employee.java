/**
 * @(#)Employee.java
 *
 *
 * @author 
 * @version 1.00 2017/3/24
 */


public class Employee {
   // Declaring instance variables
   private String employee_name;
   private String employee_no;
   private String hiredate;
   // Default Constructor
   public Employee() {
   }
   // Parameterized Constructor
   public Employee(String employee_name, String employee_no, String hiredate) {
       this.employee_name = employee_name;
       this.employee_no = employee_no;
       this.hiredate = hiredate;
   }
   // Setters and Getters
   public String getEmployee_name() {
       return employee_name;
   }
   public void setEmployee_name(String employee_name) {
       this.employee_name = employee_name;
   }
   public String getEmployee_no() {
       return employee_no;
   }
   public void setEmployee_no(String employee_no) {
       this.employee_no = employee_no;
   }
   public String getHiredate() {
       return hiredate;
   }
   public void setHiredate(String hiredate) {
       this.hiredate = hiredate;
   }
   // toString() method which displays the contents of an Object inside it.
   @Override
   public String toString() {
       System.out.println("Employee Name =" + employee_name);
       System.out.println("Employee No =" + employee_no);
       System.out.println("Hiredate =" + hiredate);
       return "";
   }
}
