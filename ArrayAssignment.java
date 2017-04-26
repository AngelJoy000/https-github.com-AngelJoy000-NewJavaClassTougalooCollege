/**
 * @(#)ArrayAssignment.java
 *
 * ArrayAssignment application
 *
 * @author 
 * @version 1.00 2017/2/21
 */
 
 import java.util.Scanner;
 
 
public class ArrayAssignment {
    
    public static void main(String[] args) {
                
                
                //For array a
       double[] a=new double[100];
   Scanner sc=new Scanner(System.in);
   System.out.println("Please enter elements for first array...");
   for(int j=0;j<=6;j++)
   a[j]=sc.nextInt();
   //System.out.println("Array A elements are : ");
  // for (int i=0;i<a.length;i++)
  // System.out.println(a[j]);
  
   //For array b
   double[] b=new double[100];
   System.out.println("Please enter elements for second array...");
   for(int j=0;j<=6;j++)
   b[j]=sc.nextInt();
   //System.out.println("Array B elements are : ");
   //for (int i=0;i<b.length;i++)
   //System.out.println(b[i]);
      
      
   double percentage = 0;
   double newPercentage = 0;
   double[] c = new double[a.length];
   for (int i = 0; i < a.length; ++i) {
       c[i] = (a[i] + b[i])/2; //For Average Array;
       percentage = c[i] * 0.10;
       newPercentage = c[i] + percentage;
       System.out.println(" the new average with the ten percent added: " + newPercentage);
   }
      
   }
}

