/**
 * @(#)DriveExam.java
 *
 *
 * @author 
 * @version 1.00 2017/3/9
 */


import java.util.Scanner;

public class DriveExam
{

public String[] userAnswers ;
public String[] answers = {"B", "D", "A", "A", "C", "A","B", "A", "C","D",
"B", "C", "D","A","D","C","C","B","D","A"};

int[] miss = new int[answers.length];
int count_correct;
int count_incorrect;


public DriveExam(String[] ans){

userAnswers = ans;
}

public boolean passed()
{
if ( count_correct >= 15){
System.out.println("you pass");
return true;
}
else{
System.out.println("you didnt pass");
return false;
}
}


public int totalCorrect()
{
for (int joy= 0; joy < answers.length; joy++){
if (userAnswers[joy].equalsIgnoreCase(answers[joy]))
count_correct++;
}
return count_correct;

}


public int totalIncorrect()
{
for (int joy = 0; joy < answers.length; joy++){
if( !userAnswers[joy].equalsIgnoreCase(answers[joy])){
miss[count_incorrect] = joy+1;
count_incorrect++;
}
}
return count_incorrect;

}


public int[] questionsMissed(){

int size = answers.length - count_correct;
int [] miss = new int [size];
int count=0;
for (int joy = 0; joy < answers.length; joy++)
{
if(!userAnswers[joy].equalsIgnoreCase(answers[joy])){
miss[count] = joy+1;
System.out.print("\nThe missed ones are : " + miss[count] + "\n");
count++;
}
}
return miss;
}
}