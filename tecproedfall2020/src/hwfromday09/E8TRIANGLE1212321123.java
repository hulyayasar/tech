package hwfromday09;

import java.util.Scanner;

public class E8TRIANGLE1212321123 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int start = 1;
		int counter=1;
		
		for(int i=1; i<=num; i++) {
			
			for(int j=num-i; j>0 ; j--) {
				System.out.print(" ");
			}
			for(int k=0 ; k<counter ; k++) {
				System.out.print(start);
				if(k<counter/2) {
					start--;
				}
				else {
					start++;
				}
			}
			
			counter=counter+2;
			System.out.println();
		}
		
		scan.close();

	}

}
