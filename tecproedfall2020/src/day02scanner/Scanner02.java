package day02scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
			    // Please type the code to get width and lenght of a rectangle from user
				// then calculate the perimeter and area of the area of the rectangle
				
				//1.step
				Scanner scan = new Scanner(System.in);
				//2.step
				System.out.println("Enter the width of the rectangle");
				//3.step
				double width = scan.nextDouble();
				
				System.out.println("Enter the lenght of the rectangle");
				double lenght= scan.nextDouble();
				
				//1.way to print the result on the console
				System.out.println("Perimeter: " + (2*width + 2*lenght));
				System.out.println("Area: " + (width*lenght));
				
				//2.way to print the result on the console
				double perimeter = 2*width + 2*lenght;
				double area = width*lenght;
				System.out.println("Perimeter: " + perimeter);
				System.out.println("Area: " + area);
				
				scan.close();

	}

}
