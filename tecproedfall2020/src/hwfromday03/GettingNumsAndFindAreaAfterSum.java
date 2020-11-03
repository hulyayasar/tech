package hwfromday03;

import java.util.Scanner;

public class GettingNumsAndFindAreaAfterSum {

	public static void main(String[] args) {
		System.out.println("Enter two integer value but first one must be greater than second one!!");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int width = num1 + num2;
		int lenght = num1 / num2;
		int perimeter = 2*(width+lenght);
		int area = width*lenght;
		
		System.out.println("perimeter: " + perimeter);
		System.out.println("area: " + area);
		
		scan.close();
	}

}
