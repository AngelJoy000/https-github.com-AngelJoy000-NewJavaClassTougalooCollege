/**
 * @(#)ArrayAssignmentRerun.java
 *
 * ArrayAssignmentRerun application
 *
 * @author Angel Patterson
 * Final One that has the enhanced for loop
 * @version 1.00 2017/2/21
 */
 
 import java.util.Scanner;
 
public class ArrayAssignmentRerun {
    
    public static void main(String[] args) {
    	
    Scanner sc = new Scanner(System.in);

      

       // declaring two array

       int[] A = new int[6];

       int[] B = new int[6];

      

       // getting user input

       System.out.println("Enter 6 grades for first array: ");

       for(int i=0; i<6; i++)

           A[i] = sc.nextInt();  //changing from double to int to see if prints without .0

      

       System.out.println("Enter 6 grades for second array: ");

       for(int i=0; i<6; i++)

           B[i] = sc.nextInt();

      

       // declaring third array that stores sum of both array

       double[] C = new double[6];  //has to be double since it does not work out

      

       for(int i=0; i<6; i++)

           C[i] = A[i] + B[i];

      

       // printing C

       System.out.println("C = A + B");

       for(double grade : C)

           System.out.print( grade + " ");

       System.out.println();

      

       // increasing C by 10%

       for(int i=0; i<6; i++)

           C[i] = C[i] + C[i]*0.10;

      

       // printing all three arrays

       System.out.println("A: ");

       for(double grade: A)

           System.out.print(grade+" ");

       System.out.println();

       System.out.println("B: ");

       for(double grade: B)

           System.out.print(grade+" ");

       System.out.println();

       System.out.println("C = C + C * 0.10 \n ");

       for(double grade: C)

           System.out.print(grade+" ");

       System.out.println();

      

   }

}