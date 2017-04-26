/**
 * @(#)DiceGame.java
 *
 * DiceGame application
 *
 * @author Angel Patterson
 * @ Chapter 5 Number 22 Dice Game
 */
 
 import java.util.Random;
 
public class Die {
    
    private int numberOfSides;
    private int dieValue;
    
    public void roll(){
    	Random random = new Random();
    	
    	dieValue = random.nextInt(numberOfSides) + 1;
    }
    public int getDieValue(){
    	return dieValue;
    }
    public Die( int numberOfSidesGiven){
    	numberOfSides = numberOfSidesGiven;
    	roll();
    	
    }
    }
    