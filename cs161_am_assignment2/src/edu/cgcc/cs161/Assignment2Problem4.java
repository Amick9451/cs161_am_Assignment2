//HEADER
//Program Name: Assignment2_problem4
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/13/2021
//Description: Java program that takes a number between 0 and 100 and prints fail if less than 50 
//and pass if number is greater than 50

//PSUEDOCODE
//Create givenNumber integer variable
//Assign number
//Create if else statement
//Assign outer if to any value between 0 and 100
//Assign outer else to any other value 
//Else statement prints "Invalid Input" if value isn't between 0 and 100
//Create nested if , else statement in outer if conditional
//Assign nested if to values greater than or equal to 50 
//Print "PASS!" if true
//Assign nested else to any other values 
//Prints "FAIL" 
//End Program

package edu.cgcc.cs161;

public class Assignment2Problem4 {
	
	public static void main(String[] args) {
		
		int givenNumber = 49;	//Change input value here 
	
	if (givenNumber >= 0 && givenNumber <= 100){
		if (givenNumber >= 50) {
			System.out.print("PASS!");
		}
		else {
			System.out.print("FAIL");
		}
	
	}
	
	else {
		System.out.println("Invalid Input");
	}
	
	}
}
//FOOTER
//FAIL


