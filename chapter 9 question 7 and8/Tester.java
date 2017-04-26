/**
 * @(#)Tester.java
 *
 *
 * @author 
 * @version 1.00 2017/3/30
 */


import java.util.Scanner;
public class Tester {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       //Creating a PreferredCustomer object which is similar to Customer object because
       //Preferred Customer extends Customer
       PerferredCustomer customer = new PerferredCustomer();
       System.out.println("Enter name ");
       customer.setName(s.nextLine());
       System.out.println("Enter address ");
       customer.setAddress(s.nextLine());
       System.out.println("Enter Mobile number "); //Enter numbers (Long)
       customer.setMobileNo(s.nextLong());
       s.nextLine();
       System.out.println("Do you want to be on the mailing list: Y or N ? ");//Case sensitive Y / N
       if (s.nextLine().equals("Y"))
           customer.setOnMailList(true);
       else
           customer.setOnMailList(false);
       do {
           System.out.println("Make a purchase. Enter the amount. To end the program press 0.");
           double amount = s.nextDouble();
           s.nextLine();
           //Add all purchases to the customer object
           customer.setPurchase(customer.getPurchase() + amount);
           //Setting discount level using setDiscountLevel function defined in PreferredCustomer class
           customer.setDiscountLevel(customer.getPurchase());
           System.out.println("Your total purchase up to now is $" + customer.getPurchase());
           System.out.println("Discount offered to you will be " + customer.getDiscount() + "%");
       } while (true); //Runs until no exception occurs due to inappropriate user input
   }
}
