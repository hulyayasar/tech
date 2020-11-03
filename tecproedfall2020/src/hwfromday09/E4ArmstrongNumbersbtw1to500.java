package hwfromday09;

import java.util.Scanner;

public class E4ArmstrongNumbersbtw1to500 {

	public static void main(String[] args) {
		/*
		 Write a program to print out all Armstrong numbers between 1 and 500.
		  If sum of cubes of each digit of the number is equal to the number itself,
		   then the number is called an Armstrong number.
			For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
		 */
		
		Scanner scan= new Scanner(System.in);
	
		for(int num1=1;num1<=500;num1++) {
			int res=0;
			int num2 = num1;
			
			while(num2>0) {
				res=res + ((num2%10) * (num2%10) * (num2%10));
				num2/=10;	
			}
			if(res==num1) {
				System.out.println(num1 + " is an Armstrong number");
			}
		}
		
		scan.close();
	
	}

}
