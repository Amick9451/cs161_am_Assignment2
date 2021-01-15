//HEADER
//Program Name: Assignment2_problem1
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/13/2021
//Description: Java program that has a floating-point number variable and prints
//"zero" if the number is zero. Otherwise, print "positive" or "negative" if the number
//is positive or negative. Add "small" if the absolute value of the number is less
//than 1, or "large" if it exceeds 1,000,000.

//PSUEDOCODE
//Program Start
//System Prints "Input Value"
//Create Double "Input" value
//Assign n number
//create if,else if statement
//assign if to all numbers >= 0
//assign else if to inputs < 0
//create if, else if, else statement inside first if statement
//assign inner if to values == to 0 
//Print "Zero" if true
//assign inner else if to inputs greater than 1000000
//Prints "Positive Large" if true
//assign inner else statement
//Prints "Positive"
//Create if, else if, else statement inside bigger else if
//assign second inner if condition to absolute values greater than one
//Prints "Small" if true
//assign else if statement to all absolute values greater than 1000000
//Prints "Negative Large"
//assign second inner else statement to any other numbers < 0
//Prints "Negative"
//Program Ends

package edu.cgcc.cs161;

public class Assignment2Problem1 {
 
	public static void main(String[] args) {
		
		System.out.print("Input Value: ");
		double input = 0;  //Change input value here :D
		
		if (input > 0)
		{
			if (input < 1) {
				
				System.out.println("Positive Small");
			}
			else if (input > 1000000) {
				
				System.out.println("Positive Large");
			}
			else {
				System.out.println("Positive");
			}
				
			}
		else if (input < 0) {
			
			if (Math.abs(input) < 1) 
			{
				System.out.println("Negative Small");
			}
			else if (Math.abs(input) > 1000000)
			{
				System.out.println("Negative Large");
			}
			else
			{
				System.out.println("Negative");
			}
		}	
		else 
		{
			System.out.println("Zero");
		}
	} 
}
// FOOTER
//Input Value: Zero

