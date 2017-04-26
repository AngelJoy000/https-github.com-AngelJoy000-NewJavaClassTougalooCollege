/**
 * @(#)BaseballDialogBoxes.java
 *
 * BaseballDialogBoxes application
 *
 * @author 
 * @version 1.00 2017/3/23
 */
 import javax.swing.*;
import java.util.Scanner;
 
public class BaseballDialogBoxes {
    
    



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double shoeCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of shoes: "));

        double shirtPantCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of shirt/pants combo: "));

        double hatCost = Double.parseDouble(JOptionPane.showInputDialog("Cost of the hats: "));

        int numberOfPlayers = Integer.parseInt(JOptionPane.showInputDialog("Number of players: "));

        double totalCost = (shoeCost + shirtPantCost + hatCost) * numberOfPlayers;
        totalCost *= 1.07; // add 7 percent sales tax.

        // Round off the result to 2 digits
        
        JOptionPane.showMessageDialog(null, String.format("Your total cost is:  $%.2f",  totalCost));
        
    }
}