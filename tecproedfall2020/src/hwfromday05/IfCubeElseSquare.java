package hwfromday05;

import java.util.Scanner;

public class IfCubeElseSquare {

	public static void main(String[] args) {
		//Ask user ta enter a number. 
		//If the number is less than 10 and greater  than or equal to 0, calculate its cube.
		//Otherwise, calculate its square. 
		//Cube of a = a*a*a           Square of a = a*a

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		if(num<10 && num>=0) {
			System.out.println("Cube of a number is " + num*num*num);
		}
		else {
			System.out.println("Square of a number is " + num*num);
		}
		
		scan.close();
	}

}
