package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check its sign");
		int grade=scan.nextInt();
		
		if(grade<0 ) {
			System.out.println("Enter a valid grade");
		}
		else if(grade<50) {
			System.out.println("D");
		}
		else if(grade<=59) {
			System.out.println("C");
		
		}
		else if(grade<=79) {
			System.out.println("B");
		}
		else if(grade<=100){
			System.out.println("A");
		}
		else {
			System.out.println("Enter a valid grade");
		}

		scan.close();
	}

}
