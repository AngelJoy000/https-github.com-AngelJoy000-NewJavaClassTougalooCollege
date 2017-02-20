/**
 * 
 *
 * @author Angel Patterson
 * Chapter 4 Question 15 Book Club Points Class
 * 
 */
 
 
import javax.swing.JOptionPane;

public class BookClubPoints {
    
    public static void main(String[] args) {
        
        
        // Variable to hold number of books purchased
		int numberBooks;
		
		// Asking for user to enter in the number of books and store in temporary variable
		String storage = JOptionPane.showInputDialog("Enter the number of monthly books purchased");
		
		// Convert user input to data-type number
		numberBooks = Integer.parseInt(storage);
		
		
		if(numberBooks >= 0)
			if(numberBooks == 0)
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 0");
			else if(numberBooks == 1)
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 5");
			else if(numberBooks == 2)
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 15");
			else if(numberBooks == 3)
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 30");
			else
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 60");
		else
			JOptionPane.showMessageDialog(null, "Invalid input");
		

	
    }
}