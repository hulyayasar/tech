package hwfromday10;

import java.util.Scanner;

public class E6dowhilePiramittriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		int i = 1;
		do {
			for(int j=num1-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(i);
			}
			System.out.println();	
			i++;
		}while(i<=num1);

		scan.close();
	}

}
