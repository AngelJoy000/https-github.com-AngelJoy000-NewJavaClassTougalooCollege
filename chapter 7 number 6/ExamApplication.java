/**
 * @(#)ExamApplication.java
 *
 * ExamApplication application
 *
 * @author 
 * @version 1.00 2017/3/9
 */
 
import java.util.Scanner;
public class ExamApplication
{
public static void main(String[] args)
{

String[] userAnswers=new String[20];

String answer;

System.out.println("Welcome to the driving testing center :\n");
System.out.println("\nPlease Enter An Answer : \n");

for(int joy=0; joy < userAnswers.length; joy++) {
System.out.println(" Question: " + (joy + 1) );

Scanner input=new Scanner(System.in);
answer=input.next();
while((!answer.equalsIgnoreCase("A")) && (!answer.equalsIgnoreCase("B")) && (!answer.equalsIgnoreCase("C")) && (!answer.equalsIgnoreCase("D")))
{
System.out.println("Please input a character using A B C or D");
answer = input.next();
}
userAnswers[joy]=answer;

}
DriveExam exam = new DriveExam(userAnswers);
System.out.println("\nThe correct answers are : " + exam.totalCorrect() + " Correct ");
System.out.println("\nThe wrong answers are : " + exam.totalIncorrect() + " Incorecct " );
exam.passed();
exam.questionsMissed();
}
}
