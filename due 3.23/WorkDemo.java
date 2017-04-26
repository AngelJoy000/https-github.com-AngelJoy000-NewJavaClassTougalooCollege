/**
 * @(#)WorkDemo.java
 *
 *
 * @author 
 * @version 1.00 2017/3/24
 */


class WorkDemo
{


   public static void main(String[] args) {
  
      
   //Creating the Production Worker Object by passing the parameters  
ProductionWorker pw1=new ProductionWorker("Angel","123-B","31-Dec-2010", 10, 1);
  
//Displaying the Production worker details
System.out.println("===== Production Worker Details =====");
pw1.toString();
pw1.addHours(39);
System.out.println("Payment for Production Worker 1:$"+pw1.calculate_Pay());
  
   //Creating the Production Worker Object by passing the parameters  
ProductionWorker pw2=new ProductionWorker("Heaven","345-H","11-Feb-1989", 15, 2);
  
//Displaying the Production worker details
System.out.println("===== Production Worker Details =====");
pw2.toString();
pw2.addHours(35);
System.out.println("Payment for Production Worker 2: $"+pw2.calculate_Pay());

   }
}
