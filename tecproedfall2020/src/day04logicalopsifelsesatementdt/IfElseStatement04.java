package day04logicalopsifelsesatementdt;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		/*
		Type java code by using if-else statement.
		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
		Ask user for quantity then judge and print total cost for user.
		If the quantity is less than 1000 output will be “No discount.”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter quantity and unit price");
		double quantity =scan.nextDouble();
		int price =scan.nextInt();
		
		
		if(quantity >1000) {
			System.out.println("Total price after discount: " + quantity*0.9*price);
		}
		else {
			System.out.println("No discount.");
		}
		
		scan.close();

	}

}
