/**
 * @(#)RomanNumerals.java
 *
 * RomanNumerals application
 *
 * @author Angel Patterson
 * January 31, 2017
 * @version 1.00 2017/1/31
 */
 
 import java.util.Scanner;
 
public class RomanNumerals {
    
    public static void main(String[] args) {
    	
    	
    	Scanner keyboard = new Scanner(System.in);
    
    	System.out.print("Enter a number in the range 1 to 10: \n");
    	
    	
    	
  int userInputNumber = keyboard.nextInt();
  
  keyboard.close();
  
  String GetRomanNumeral = conversionToRomanNumeral(userInputNumber);
  
  
  System.out.println(" Your corresponding Roman Numeral is: " + GetRomanNumeral);
    }
    
    static String conversionToRomanNumeral(Integer userInputNumber){
    	
    	switch (userInputNumber){
    		
    		case 1:
    			return "I";
    			
    			case 2:
    				return "II";
    				case 3:
    					return "III";
    					case 4:
    						return "IV";
    							case 5:
    								return "V";
    								case 6:
    									return "VI";
    									case 7:
    										return "VII";
    										case 8:
    											return "VIII";
    											case 9:
    												return "IX";
    												case 10:
    													return "X";
    													default:
    														return "Entered something not requested. Please have another go at it.";
    													
    	}
    }
}
