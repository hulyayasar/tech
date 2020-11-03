package hwfromday09;

import java.util.Scanner;

public class E2findingLargestAndSmallestOne {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
		int i=0,j=0;
		int bigger=0;
		int smaller=0;
		while(i==0) {
			
			int num = scan.nextInt();
			if(num<=0) {
				System.out.println("you entered 0 or negative number");
				i++;
			}
			
			else {
				
				if(num>bigger) {
					bigger=num;
				}
				while(j==0) {
					smaller=num;
					j++;
					
				}
				if(num<smaller ) {
					smaller=num;
				}
			}
		}
		System.out.println("The biggest number is: " + bigger + " The smallest number is: " + smaller);
		
		scan.close();
	}

}
