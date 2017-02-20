/**
 *
 * @ Angel Patterson
 *   Heads and Tails Game
 *   Chapter 6 Number 14
 */
 
 import java.util.Scanner;
 
public class HeadsOrTailsGame {
    
    public static void main(String[] args) {
    	
    
Scanner scan = new Scanner(System.in);
Player playerA = new Player();
Player playerB = new Player();

Coin coinA = new Coin();
Coin coinB = new Coin();

while(true)
{
System.out.print(" First player you are Player A. Please enter 1 for tails or 0 for heads: ");
int inputGuess = scan.nextInt();

if(inputGuess == coinA.coinToss())
{
playerA.incrementScore();
System.out.println("Good guess the coin side facing upwards was: " + Coin.getcoinSide());
}
else
{
playerA.decrementScore();
System.out.println("Oops you did guess correctly. The coin side facing upwards was : " + Coin.getcoinSide());
}

System.out.println("Player A's current score is: " + playerA.getPlayerScore());


System.out.print("Second player you are Player B.Please enter 1 for tail or 0 for heads: ");
inputGuess = scan.nextInt();

if(inputGuess == coinB.coinToss())
{
playerB.incrementScore();
System.out.println("Good guess the coin side facing upwards was: " + Coin.getcoinSide());

}
else
{
playerB.decrementScore();
System.out.println("Oops you did guess correctly. The coin side facing upwards was :" + Coin.getcoinSide());

}
  
System.out.println("Player B's current score is: " + playerB.getPlayerScore());

if(playerA.getPlayerScore() == 5)
{
System.out.println();
System.out.println("Player A wins");
break;
}

else if(playerB.getPlayerScore() == 5)
{
System.out.println();
System.out.println("Player B wins");
break;
}
  
}}}

