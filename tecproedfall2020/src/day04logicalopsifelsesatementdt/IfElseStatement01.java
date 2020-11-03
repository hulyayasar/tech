package day04logicalopsifelsesatementdt;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer to check if it odd or even");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%2 == 1) {
			System.out.println("The number is an odd");
		}
		else {
			System.out.println("The number is an even");
		}
		
		scan.close();
	}

}
