/**
 * @(#)Person.java
 *
 * Person application
 *
 * @author 
 * @version 1.00 2017/3/30
 */
 
public class Person {
   String name, address;
   Long mobileNo;
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getAddress() {
       return address;
   }
   public void setAddress(String address) {
       this.address = address;
   }
   public Long getMobileNo() {
       return mobileNo;
   }
   public void setMobileNo(Long mobileNo) {
       this.mobileNo = mobileNo;
   }
   @Override
   public String toString() {
       return "Person [name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
   }
}
