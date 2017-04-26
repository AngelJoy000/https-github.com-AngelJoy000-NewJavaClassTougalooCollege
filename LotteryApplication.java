/**
 * @(#)LotteryApplication.java
 *
 * LotteryApplication application
 *
 * @author 
 * @version 1.00 2017/3/9
 */
 
public class LotteryApplication {
    
    public static void main(String[] args) {
    	
 	Lottery lottery new Lottery();
	
		System.out.println("Lottery Game\n");
		
		System.out.println("You have to guess five numbers. Numbers arev 0 throgh 9 only. \n");
		
		Scanner angel = new Scanner(System.in);
		
		int numbers [] = new int[5];

System.out.print("Enter in the Numbers.");


for (int joy = 0;  joy < numbers.length;   joy++)
{
	
	numbers[joy] = angel.nextInt();
}


int match = lottery.compareNumbers(numbers);

if(match == 5)

System.out.println("You Won!");

else{
	
	System.out.println("Number of correct numbers guesses are: " + match);
	
}}}