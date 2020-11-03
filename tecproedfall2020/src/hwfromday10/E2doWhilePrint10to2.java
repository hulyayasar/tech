package hwfromday10;

import java.util.Scanner;

public class E2doWhilePrint10to2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a begining  value");
		int num1 = scan.nextInt();
		System.out.println("Enter a last  value");
		int num2 = scan.nextInt();
		
		int i=0;
		do {
			System.out.print(num1+i + " ");
			i--;
		}while(num1+i>=num2);
		
		scan.close();
		

	}

}
