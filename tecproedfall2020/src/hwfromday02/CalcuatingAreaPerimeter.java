package hwfromday02;

import java.util.Scanner;

public class CalcuatingAreaPerimeter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a lenght size");
		double lenght = scan.nextDouble();
		
		
		System.out.println("Enter a wight size");
		double wight = scan.nextDouble();
		
		double area = (lenght*wight);
		double perimeter = 2*(lenght+wight);
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		scan.close();

	}

}
