/**
 * @(#)Coin.java
 *
 *
 * @author 
 * @version 1.00 2017/2/19
 */


import java.util.Random;
import java.util.Scanner;

class Coin
{
private static String coinSide;

public Coin()
{
this.coinSide = "Heads";
coinToss();
}

public int coinToss()
{
Random randnumber = new Random();

int number = randnumber.nextInt(2);
if (number == 0)
{
this.coinSide = "Heads";
}
else
{
this.coinSide = "Tails";
}
return number;
}

public static String getcoinSide()
{
return coinSide;
}}