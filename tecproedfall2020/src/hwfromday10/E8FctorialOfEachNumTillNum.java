package hwfromday10;

import java.util.Scanner;

public class E8FctorialOfEachNumTillNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int num=scan.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			int fac=1;
			for(int j=1;j<=i;j++) {
				fac=fac*j;
			}
			System.out.println("Factorial of " + i + " is " + fac);
			
		}
		
		scan.close();
		
	}

}
