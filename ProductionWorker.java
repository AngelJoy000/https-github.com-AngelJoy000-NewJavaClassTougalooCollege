/**
 * @(#)ProductionWorker.java
 *
 * ProductionWorker application
 *
 * @author 
 * @version 1.00 2017/3/24
 */
 

 public class ProductionWorker extends Employee {
   // Declaring instance variables
   private double hourly_pay_rate;
   private int shift;
   private int no_of_hours;
   // Default Constructor
   public ProductionWorker() {
       super();
   }
   // Parameterized Constructor
   public ProductionWorker(String employee_name, String employee_no,
           String hiredate, double hourly_pay_rate, int shift) {
       super(employee_name, employee_no, hiredate);
       this.hourly_pay_rate = hourly_pay_rate;
       this.shift = shift;
   }
   // Setters and Getters
   public double getHourly_pay_rate() {
       return hourly_pay_rate;
   }
   public void setHourly_pay_rate(double hourly_pay_rate) {
       this.hourly_pay_rate = hourly_pay_rate;
   }
   public int getShift() {
       return shift;
   }
   public void setShift(int shift) {
       this.shift = shift;
   }
  
   public void addHours(int hours)
   {
       this.no_of_hours+=hours;
   }
  
   public double calculate_Pay()
   {
       return no_of_hours*hourly_pay_rate;
   }
   // toString() method which displays the contents of an Object inside it.
   @Override
   public String toString() {
       super.toString();
       System.out.println("Hourly Pay Rate =" + hourly_pay_rate);
       if(getShift()==1)
       System.out.println("Shift = Day");
       else if(getShift()==2)
       System.out.println("Shift = Night");  
       return "";
   }
}








