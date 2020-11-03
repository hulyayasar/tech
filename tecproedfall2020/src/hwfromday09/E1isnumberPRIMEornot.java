package hwfromday09;

import java.util.Scanner;

public class E1isnumberPRIMEornot {

	public static void main(String[] args) {
		//Write a program that prompts the user to input a positive integer.
		//It should then output a message indicating whether the number is a prime number.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = scan.nextInt();
		
		int i=2;
		int check = 0;
		
		while(i<num) {
			if(num%i==0) {
				System.out.println("The number is NOT prime");
				i=num;
				check++;
			}
			else {
				i++;
			}
		}
		if(check==0) {
			System.out.println("The number is  prime");
		}
		scan.close();
		
	}
	

}
