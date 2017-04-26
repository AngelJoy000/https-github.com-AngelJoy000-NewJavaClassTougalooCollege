/**
 * @(#)PerferredCustomer.java
 *
 *
 * @author 
 * @version 1.00 2017/3/30
 */


public class PerferredCustomer extends Customer {
   double discount;
   double purchase;
   public double getDiscount() {
       return discount;
   }
   public void setDiscount(double discount) {
       this.discount = discount;
   }
   public double getPurchase() {
       return purchase;
   }
   public void setPurchase(double purchase) {
       this.purchase = purchase;
   }
   @Override
   public String toString() {
       return "PerferredCustomer [discount=" + discount + ", purchase=" + purchase + "]";
   }
   void setDiscountLevel(double purchase) { //Changes discount level based on cumulative purchase
       if (purchase >= 500)
           discount = 5;
       if (purchase >= 1000)
           discount = 6;
       if (purchase >= 1500)
           discount = 7;
       if (purchase >= 2000)
           discount = 10;
   }
}