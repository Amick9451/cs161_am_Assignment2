//HEADER
//Program Name: Assignment2_problem3
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/13/2021
//Description: Prints positive if user number greater than 0, prints "negative" if 
//user number less than 0, prints neither if number is == 0


//PSUEDOCODE
//Program Start
//Create int variable for user number
//Create if,else if, else statement 
//Assign if to print "Positive" if integer greater than 0
//Assign else if to print "Negative" if integer less than 0
//Print "Neither" if integer is 0
//Program End

package edu.cgcc.cs161;

public class Assignment2Problem3 {

	public static void main(String[] args) {
	int userNumber = 100;		//Change user number here
	
	if (userNumber > 0) {
		
		System.out.println("Positive");
		
		}
	else if (userNumber < 0) {
		
		System.out.println("Negative");

		}
	else {
		
		System.out.println("Neither");
	}

	}

}

//FOOTER
//Positive
