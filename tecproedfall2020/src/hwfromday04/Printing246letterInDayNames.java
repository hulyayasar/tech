package hwfromday04;

import java.util.Scanner;

public class Printing246letterInDayNames {

	public static void main(String[] args) {
		System.out.println("Enter a day");
		Scanner scan = new Scanner(System.in);
		String day = scan.next();
		
		System.out.println(day.charAt(1) +""+ day.charAt(3) +""+ day.charAt(5));
		
		/*if(day.length() > 2) {
			System.out.println(day.charAt(3));
		}
		if(day.length() > 4) {
			System.out.println(day.charAt(5));
		}
		if(day.length() > 6) {
			System.out.println(day.charAt(7));
		}*/
		scan.close();
	}

}
