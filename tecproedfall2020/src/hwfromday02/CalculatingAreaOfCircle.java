package hwfromday02;

import java.util.Scanner;

public class CalculatingAreaOfCircle {

	public static void main(String[] args) {
		float pi = 3.14159f;
		
		System.out.println("Enter a radius of a circle");
		Scanner scan = new Scanner(System.in);
		float radius = scan.nextFloat();
		
		float area = pi*radius*radius;
		float perimeter = 2*pi*radius;
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		scan.close();
	}

}
