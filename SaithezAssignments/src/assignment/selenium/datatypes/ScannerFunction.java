package assignment.selenium.datatypes;

import java.util.Scanner;

public class ScannerFunction {

		static char correctAnswer = 'a';

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the correct answer for a multiple choice question ");
			char option = scn.next().charAt(0);
			char optionOne = Character.toLowerCase(option);
			if (optionOne==correctAnswer)
			{
				System.out.println("Entered option is correct which is " + optionOne); 
			}
			else 
			{
				System.out.println("Entered option is not correct answer and the correct answer is " + correctAnswer);
			}
			scn.close();
		}

		}
