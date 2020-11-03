package day05ifelseifnestedifternary;

import java.util.Scanner;

public class SwapQuestion {

	public static void main(String[] args) {
		// 1.way to swap two integer by using third variable
		System.out.println("Enter two variable to swap");
		Scanner scan = new Scanner(System.in);
		int num1 =scan.nextInt();
		int num2 = scan.nextInt();
		int temp ;
		
		System.out.println("num1: " + num1 + " num2: "  + num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("swapped num1: " + num1 + " swapped num2: "  + num2);
		
		// 1.way to swap two integer WITHOUT using third variable
		System.out.println("num1: " + num1 + " num2: "  + num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("swapped num1: " + num1 + " swapped num2: "  + num2);
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
