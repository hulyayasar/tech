package hwfromday09;

import java.util.Scanner;

public class E2FindingHCF {

	public static void main(String[] args) {
		//Write a program to calculate HCF of Two given number. Highest Common Factor.
		//Greatest Common Divisor(GCD)
		
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		
		
		int i=num-1;
		
		while(i>0) {
			if(num%i==0) {
				System.out.println(num + "'s HCF is " + i);
				
				i=0;
			}
			else{
				i--;
			}
		}
		
		scan.close();
		
		

	}

}
