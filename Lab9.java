/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby
// FILENAME: Lab9.java
// SPECIFICATION: Array demonstration and sum
// FOR: CSE 110- Lab #9
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/


import java.util.Scanner;
import java.util.Arrays;

public class Lab9 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("How many elements in the array?");
	int n = in.nextInt();
	double [] myArray = new double[n];
	
	for (int i = 0; i < n; i++) {
		System.out.println("Please enter the next value");
		myArray[i] = in.nextDouble();
	}
	
	double sum = 0.0;
	int counter = 0;
	
	for (int i = n - 1; i >= 0; i--) {
		System.out.print(myArray[i] + " ");
		counter++;
		if(counter % 8 == 0) {
			System.out.println();
		}
	}
	sum = Arrays.stream(myArray).sum();
		
	
	
	System.out.println();
	System.out.println("The sum of the array's elements is: " + sum);
	
	} // Close the main function.
} // Close the Lab9 class.