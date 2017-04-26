/**
 * @(#)BaseballWithClasses.java
 *
 * BaseballWithClasses application
 *
 * @author 
 * @version 1.00 2017/3/24
 */
 import javax.swing.*;
import java.util.Scanner;

public class BaseballWithClasses {
    
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double shoeCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of shoe: "));

        double shirtPantCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of shirt/pants combo: "));

        double hatCost = Double.parseDouble(JOptionPane.showInputDialog("Cost of the hat: "));

        int numberOfPlayers = Integer.parseInt(JOptionPane.showInputDialog("Number of player: "));

        System.out.println(String.format("Final cost: %.2f",
                BaseballWithClassesTester.calculateCost(shoeCost, shirtPantCost, hatCost, numberOfPlayers)));
    }
}
