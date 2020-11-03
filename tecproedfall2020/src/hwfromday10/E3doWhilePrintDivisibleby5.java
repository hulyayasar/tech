package hwfromday10;

import java.util.Scanner;

public class E3doWhilePrintDivisibleby5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a begining  value");
		int num1 = scan.nextInt();
		System.out.println("Enter a last  value");
		int num2 = scan.nextInt();
		
		int i=num1;
		do {
			if(i%5==0) {
				System.out.print(i + " ");
			}
			
			i++;
		}while(i<=num2);
		
		scan.close();

	}

}
