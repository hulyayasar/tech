package hwfromday10;

import java.util.Scanner;

public class E5rightTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		for(int i=1;i<=num1;i++) {
			for(int j=num1-i;j>0;j-- ) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		scan.close();

	}

}
