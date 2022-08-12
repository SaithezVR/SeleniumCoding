package assignment.selenium.datatypes;

import java.util.Scanner;

public class MultipleChoiceQuestionsEvaluation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int correctAnswer=0;
		int wrongAnswer=0;
		int j=0;
		
		char correctAnswers[]= {'a','b','c','d','a','b','c','d','d','d'};
		for(i=0;i<=9;i++)
		{
		Scanner scn = new Scanner(System.in);
		j=i+1;
		System.out.println("Enter the correct answer for question no" + j);
		char option = scn.next().charAt(0);
		char optionOne = Character.toLowerCase(option);
		if (optionOne==correctAnswers[i])
		{
			//System.out.println("Entered option for question(i) no :" + optionOne);
			correctAnswer++;
		}
		else 
		{
			//System.out.println("Entered option is not correct answer and the correct answer is " + correctAnswers[i]);
			wrongAnswer++;
		}
		}
		System.out.println("Total no of right answers " + correctAnswer);
		System.out.println("Total no of wrong answers " + wrongAnswer);
		int totalMarks = (correctAnswer*3)-(wrongAnswer*1);
		System.out.println("Total marks in the examination " + totalMarks);
	}
}


	


