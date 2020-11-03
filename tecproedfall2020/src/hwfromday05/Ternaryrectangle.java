package hwfromday05;

import java.util.Scanner;

public class Ternaryrectangle {

	public static void main(String[] args) {
		// Type java code by using using ternary. 
		//Take values of length and width of a rectangle from user and check if it is square or not.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a lenght of the rectangle");
		int lenght = scan.nextInt();
		System.out.println("Enter a width of the rectangle");
		int width = scan.nextInt();
		
		if(width>0 && lenght>0) {
			if(width ==lenght) {
				System.out.println("It is a square");
			}
			else if(width !=lenght) {
				System.out.println("It is NOT a square");
			}
		}
		else {
			System.out.println("Enter a valid numbers");
		}
		
		scan.close();
	}

}
