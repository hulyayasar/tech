package hwfromday08;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
		   If it is greater than 10 multiply it by 2 and print it on the console. 
		   Otherwise keep the number same  and print it on the console.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int num = scan.nextInt();
		
		if(num<10) {
			System.out.println("Square: " + num*num);
		}
		else if (num>10) {
			System.out.println("multiply by 2: " + 2*num);
		}
		else {
			System.out.println(num);
		}
		scan.close();
		
		
	}

}
