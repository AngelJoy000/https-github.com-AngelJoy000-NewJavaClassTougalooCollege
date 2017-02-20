/**
 * @(#)Player.java
 *
 *
 * @author 
 * @version 1.00 2017/2/19
 */


import java.util.Random;

class Player
{
private int playerScore;

public Player()
{
playerScore = 0;
}

public void incrementScore()
{
playerScore++;
}

public void decrementScore()
{
if(playerScore > 0)
playerScore--;
else
System.out.println("Score is already zero");
}

public int getPlayerScore()
{
return playerScore;
}
}

