/**
 * @(#)BaseballSimpleJava.java
 *
 * BaseballSimpleJava application
 *
 * @author Angel Patterson Simple Java Test 
 * 
 */
		import java.util.Scanner; 


		public class BaseballSimpleJava {
    
  
   		 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the cost of shoes: ");
        double shoeCost = in.nextDouble();

        System.out.print("Enter the cost of shirt/pants combo: ");
        double shirtPantCost = in.nextDouble();

        System.out.print("Cost of hats: ");
        double hatCost = in.nextDouble();

        System.out.print("Number of players: ");
        int numberOfPlayers = in.nextInt();

        double totalCost = (shoeCost + shirtPantCost + hatCost) * numberOfPlayers;
        totalCost *= 1.07; // add 7 percent sales tax.

        // Round off the result to 2 digits
        System.out.println(String.format("Final cost: %.2f", totalCost));
    }
}