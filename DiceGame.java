
/**
 * @(#)DiceGame.java
 *
 * DiceGame application
 *
 * @author Angel Patterson
 * @ Chapter 5 Number 22 Dice Game
 */
 
 import javax.swing.JOptionPane;
 
public class DiceGame {
    
    public static void main(String[] args) {
    	
    Die userDie = new Die (6);
    Die computerDie = new Die (6);
    
    int userWins = 0;
    int computerWins = 0;
    int ties = 0;
    
    for (int currentRoll = 1; currentRoll <= 10; currentRoll++) {
    	userDie.roll();
    	computerDie.roll();
    	
    	if (userDie.getDieValue() > computerDie.getDieValue()){
    		userWins += 1;
    	} else if (computerDie.getDieValue() > userDie.getDieValue()){
    		computerWins = computerWins +1;
    	}else{
    		ties +=1;
    	}
    }
    if (userWins > computerWins){
    	JOptionPane.showMessageDialog(null, "The user is the grand winner with a score of " + userWins + " wins. The computer " + " Lost with a score of  " + computerWins + " wins.");
    }else if (computerWins > userWins){
    	JOptionPane.showMessageDialog(null, "The computer is the grand winner with a score of " + computerWins + " wins. The user lost with a score of " + userWins + " wins.") ;
    	
    } else {
    		JOptionPane.showMessageDialog(null, "It was a tie with the computer winning " + computerWins + " wins and the user winning " + userWins + " wins.");
    	
    }
    }
    }
    	



