package hwfromday09;

import java.util.Scanner;

public class E10forloop07reverseSPACEtriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=0 ; i<=num;i++) {
			for(int j=num+i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=num-i ; k>0; k--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		scan.close();

	}

}
