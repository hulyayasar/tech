package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Nestedif05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year");
		int year=scan.nextInt();
		
		if(year<0) {
			System.out.println("Enter a valid year");
		}
		else if(year%100==0) {
			if(year%400==0) {
				System.out.println("it is a leap year");
			}
			else {
				System.out.println("it is NOT a leap year");
			}
		}
		
		else if(year%100!=0) {
			if(year%4==0) {
				System.out.println("it is a leap year");
			}
			else {
				System.out.println("it is NOT a leap year");
			}
		}
		
		scan.close();

	}

}
