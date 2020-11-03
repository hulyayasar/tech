package day02scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side length of the square");
		double sideLenght = scan.nextDouble();
		double perimeter = 2*sideLenght;
		double area = (sideLenght*sideLenght);
		System.out.println("Perimeter: " + perimeter);
		System.out.println(area);
		
		scan.close();

	}

}
