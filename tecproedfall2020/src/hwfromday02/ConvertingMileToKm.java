package hwfromday02;

import java.util.Scanner;

public class ConvertingMileToKm {

	public static void main(String[] args) {
		//km=mile*1.6
		System.out.println("Enter a mile value");
		Scanner scan = new Scanner(System.in);
		double numMile = scan.nextDouble();
		double numKm = (numMile*1.6);
		
		System.out.println("Mile value is: " + numMile);
		System.out.println("Km value is: " + numKm);

		
		scan.close();
	}

}
