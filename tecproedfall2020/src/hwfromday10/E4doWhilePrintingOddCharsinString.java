package hwfromday10;

import java.util.Scanner;

public class E4doWhilePrintingOddCharsinString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter a String");
		String str = scan.nextLine();
		System.out.println(str);
		
		int i=0;
		do {
			
			if(i%2==1) {
				System.out.print(str.charAt(i) + " ");
			}
			i++;
			
		}while(i<str.length());
		
		scan.close();

	}

}
