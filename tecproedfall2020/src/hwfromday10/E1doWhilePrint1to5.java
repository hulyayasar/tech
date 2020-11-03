package hwfromday10;

import java.util.Scanner;

public class E1doWhilePrint1to5 {

	public static void main(String[] args) {
		//Write a program to print numbers from 1 to 5 on the console by using do-while loop.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a begining  value");
		int num1 = scan.nextInt();
		System.out.println("Enter a last  value");
		int num2 = scan.nextInt();
		
		int i=0;
		do {
			System.out.print(num1+i + " ");
			i++;
		}while(num1+i<=num2);
		
		scan.close();
		

	}

}
