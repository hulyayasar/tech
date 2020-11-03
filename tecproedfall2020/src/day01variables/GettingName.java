package day01variables;
import java.util.Scanner;

public class GettingName {

	public static void main(String[] args) {
		System.out.println("Enter your full name");
		Scanner scan = new Scanner(System.in);
		String fullName = scan.nextLine();
		
		System.out.println("Your full name is: " + fullName);
		
		
		System.out.println("Enter your full address");
		String fullAddress = scan.nextLine();
		
		System.out.println("Your full addres is: " + fullAddress);
		
		System.out.println(5f/2f);
		System.out.println(5d/2d);
		
		scan.close();
	}

}
