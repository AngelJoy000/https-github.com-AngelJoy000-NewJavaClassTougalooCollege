/**
 * AWT Sample application
 *
 * @author Angel Patterson
 *Chapter 4 Problem 5 Bank Charges Class
 * 
 */
import java.text.*;
import javax.swing.JOptionPane;

public class BankCharges {
    
    public static void main(String[] args) {
    
    
    
	// Declare variable for base fee
		double baseFee = 10;
		
		// Prompt user for the number of checks written
		String input1 = JOptionPane.showInputDialog("Enter the number of checks written");
		
		// Convert the number of checks to data-type int
		int checks = Integer.parseInt(input1);
		
		// Declare total check fees based on quota.
		double lessTwenty = .10 * checks;
		double twentyPlus = .08 * checks;
		double fortyPlus = .06 * checks;
		double sixtyPlus = .04 * checks;
		
		// Declare total service fees
		double lessTwentyTotal = .10 * checks + baseFee;
		double twentyPlusTotal = .08 * checks + baseFee;
		double fortyPlusTotal = .06 * checks + baseFee;
		double sixtyPlusTotal = .04 * checks + baseFee;
		
		// Decimal formating for Time variables
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);
		 
		// Design if-else structure to display the appropriate
		// service fees given the quantity of checks written.
	
		if (checks < 60)
			if (checks >= 40)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(fortyPlus) + "\nTotal Fees: $" + fortyPlusTotal);
			else if(checks >= 20)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(twentyPlus) + "\nTotal Fees: $" + twentyPlusTotal);
			else
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(lessTwenty) + "\nTotal Fees: $" + lessTwentyTotal);
		else
			JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(sixtyPlus) + "\nTotal Fees: $ " + sixtyPlusTotal);
	}

}