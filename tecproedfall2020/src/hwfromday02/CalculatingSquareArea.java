package hwfromday02;

import java.util.Scanner;

public class CalculatingSquareArea {

	public static void main(String[] args) {
		System.out.println("Enter a lenght of square");
		Scanner scan = new Scanner(System.in);
		double lenght = scan.nextDouble();
		
		
		double area = (lenght*lenght);
		double perimeter = (2*lenght);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		scan.close();
	}

}
