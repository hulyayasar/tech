package day11doWhilemethodCreationdt;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num =0;
		do {
			System.out.println("Enter an integer");
			num = scan.nextInt();
		
		}while(num%2!=0);
		
		System.out.println("You won!");
		
		scan.close();
	}

}
