package hwfromday10;

import java.util.Scanner;

public class E9IncomeTaxCalculator {

	public static void main(String[] args) {
		/*
		 For example, suppose that the taxable income is $85000,
		  the income tax payable is $20000*0% + $20000*10% + $20000*20% + $25000*30%.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your income");
		double income = scan.nextDouble();
		double taxpayable = 0;
		System.out.println("Income " + income);
		
		for(int i=0 ;income>0 ;i++) {
			if(income>20000 && income<40000) {
				taxpayable+=(income/10)*i;
				income=0;
			}
			else if(income>20000) {
				taxpayable+=(20000/10)*i;
				income-=20000;
			}
			else {
				System.out.println("Enter a valid income");
			}
			
		}
		
		System.out.println("the income tax payable is " + taxpayable);
		
		scan.close();
	}

}
