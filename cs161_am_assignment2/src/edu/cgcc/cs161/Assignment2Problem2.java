//HEADER
//Program Name: Assignment2_problem2
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/13/2021
//Description: A Java representation of AND,OR, and a NAND gate. 


//PSUEDOCODE
//Program Start
//*AND Gate*
//Create two integer variables
//Assign them 1 or 0
//Create conditional if gate
//Print output
//*OR Gate*
//create two integer variables
//assign 1 or 0
//print correct output
//*NAND Gate*
//Create two variables
//Assign 1 or 0
//Create if statement
//If two variables multiplied together == 0
//Print "1"
//IF two variables multiplied together > 0
//Print "0"
//Program End


package edu.cgcc.cs161;

public class Assignment2Problem2 {
	
	
//AND gate below 
	public static void main(String[] args) {
		int one = 0;		//Change int here 1 or 0
		int zero = 0;		//Change int here 1 or 0
		if (one <= 1 && zero <= 1 ){
			System.out.print(one * zero);
		}
// OR gate below
		
		int two = 0;	//Change int here 1 or 0
		int three = 1;	//Change int here 1 or 0
		
		if (two <= 1 || three <= 1) {
			System.out.print('\n');
			System.out.print(two + three);
		}
		
//NAND gate below
		
		int four = 0;	//Change int here 1 or 0
		int five = 0;	//Change int here 1 or 0
		
	if ((four * five) == 0  ) {
			
			System.out.print('\n');
			System.out.print(1);
					
		}
	else if ((four * five)  > 0) {
		
			System.out.print('\n');
			System.out.print(0);
			
		}
			
			
	}
	

}
//FOOTER
//0
//1
//1
