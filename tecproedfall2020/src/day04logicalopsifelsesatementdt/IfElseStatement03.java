package day04logicalopsifelsesatementdt;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its absolute value");
		int num =scan.nextInt();
		if(num>=0) {
			System.out.println(num);
			System.out.println("the number is positive");
		}
		else {
			System.out.println(-1*num);
			System.out.println("the number is negative");
		}
		
		scan.close();

	}

}
