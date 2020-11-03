package hwfromday09;

import java.util.Scanner;

public class E3GetNumberTilluserEnter0ornegative {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		 
		
		int i=0;
		while(i==0) {
			int num = scan.nextInt() ;
			if(num<=0) {
				i++;
				System.out.println("you entered 0 or negative number");
			}
			else {
				System.out.println(num + "   ");
			}
		}
		
		scan.close();

	}

}
