/**
 * @(#)Lottery.java
 *
 *
 * @author 
 * @version 1.00 2017/3/9
 */

import java.util.Random;
import java.util.Scanner;



public class Lottery{


private int lotteryNumbers[];
public Lottery()

{
	
	Random ran = new Random (system.currentTimeMillis());
	
	lotteryNumbers = new int [5];
	
	for(int joy = 0;  joy < lotteryNumbers.length; joy++)
	{
		
		lotteryNumbers[joy] = Math.abs(ran.nextInt()) % 10;
	}}
	
	public int compareNumbers (int[] usersNumbers)
	{
		
		int match = 0;
		if (usersNumbers.length == lotteryNumbers.length)
		{
			for (int joy = 0; joy < lotteryNumbers.length; joy++)
			{
				if (usersNumbers[joy] == lotteryNumber[joy])
				{
					
					match++;
				}}}
				return match;
				
	}
	}
