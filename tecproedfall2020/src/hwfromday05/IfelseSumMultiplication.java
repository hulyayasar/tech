package hwfromday05;

import java.util.Scanner;

public class IfelseSumMultiplication {

	public static void main(String[] args) {
		//Type java code by using if-else if() statement,  
		//if both of the two integers are positive, output will be the sum of them.  
		//If both of the two integers are negative, output will be the multiplication of them. 
		//Otherwise; output will be “I cannot add or multiply different signed numbers"

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integer");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1>=0 && num2>=0) {
			System.out.println(num1+num2);
		}
		else if(num1<0 && num2<0) {
			if(num1>num2) {
				System.out.println(num1-num2);
			}
			else {
				System.out.println(num2-num1);

			}
		}
		else {
			System.out.println("I cannot add or multiply different signed numbers");
		}
		
		scan.close();
	}

}
