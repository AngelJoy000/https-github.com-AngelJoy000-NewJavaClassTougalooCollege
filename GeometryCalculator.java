/**
 * @(#)GeometryCalculator.java
 *
 * GeometryCalculator application
 *
 * Angel Patterson
 * Chapter 6 Question 14 
  * 
 */
 
 import java.util.Scanner;
public class GeometryCalculator {
    
    
 public static class Geometry {
       public static double areaOfCircle(double radius) {
           return Math.PI * radius * radius;
       }

       public static double areaOfRectangle(double length, double width) {
           return length * width;
       }

       public static double areaOfTriangle(double base, double height) {
           return base * height * 0.5;
       }
   }

   public static void main(String[] args) {

       int selection; 

       do {
           
           selection = Menu();

           if (selection == 1) {
               calculateAreaofCircle();
           } else if (selection == 2) {
               calculateAreaofRectangle();
           } else if (selection == 3) {
               calculateTriangleArea();
           } else if (selection == 4) {
               System.out.println("You have chosen to close the calculator.");
           }

       } while (selection != 4);
   }

   public static int Menu() {

       int chosenSelection;

       
       Scanner inputUser = new Scanner(System.in);

      
       System.out.println("Geometry Calculator\n");
       System.out.println("1. Calculate the Area of a Circle");
       System.out.println("2. Calculate the Area of a Rectangle");
       System.out.println("3. Calculate the Area of a Triangle");
       System.out.println("4. Quit\n");
       System.out.print("Enter your selection (1-4) : ");

      
       chosenSelection = inputUser.nextInt();

       
       while (chosenSelection < 1 || chosenSelection > 4) {
           System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
           chosenSelection = inputUser.nextInt();
       }

       return chosenSelection;
   }

   public static void calculateAreaofCircle() {

       double radius;

       
       Scanner inputUser = new Scanner(System.in);
       System.out.print("What is the circle's radius? ");
       radius = inputUser.nextDouble();

       
       System.out.println("The circle's area is "
               + Geometry.areaOfCircle(radius));
   }

   public static void calculateAreaofRectangle() {
       double length;
       double width;

       
       Scanner inputUser = new Scanner(System.in);

       
       System.out.print("Enter length? ");
       length = inputUser.nextDouble();

       
       System.out.print("Enter width? ");
       width = inputUser.nextDouble();

       
       System.out.println("The rectangle's area is "
               + Geometry.areaOfRectangle(length, width));
   }

   public static void calculateTriangleArea() {

       double base;
       double height;

       
       Scanner inputUser = new Scanner(System.in);

       
       System.out.print("Enter length of the triangle's base? ");
       base = inputUser.nextDouble();

       
       System.out.print("Enter triangle's height? ");
       height = inputUser.nextDouble();

       
       System.out.println("The triangle's area is "
               + Geometry.areaOfTriangle(base, height));
   }

}