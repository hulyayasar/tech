package hwfromday03;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		System.out.println("Enter two integer value ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		
		if(num1>num2) {
			
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
			
		}
		
		if(num2>num1) {
			
			num2=num2+num1;
			num1=num2-num1;
			num2=num2-num1;
			
		}
		
		System.out.println("swapped num1: " + num1 + " swapped num2: " + num2);

		scan.close();
	}

}
