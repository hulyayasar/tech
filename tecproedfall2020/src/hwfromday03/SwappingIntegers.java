package hwfromday03;

import java.util.Scanner;

public class SwappingIntegers {

	public static void main(String[] args) {
		System.out.println("Enter two integer value ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3;
		
		System.out.println("Num1: " + num1 + " Num2: " + num2);
		
		num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println("Swapped Num1: " + num1 + " Swapped Num2: " + num2);

		scan.close();
	}

}
