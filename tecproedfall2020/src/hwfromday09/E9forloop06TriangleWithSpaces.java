package hwfromday09;

import java.util.Scanner;

public class E9forloop06TriangleWithSpaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=num-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
