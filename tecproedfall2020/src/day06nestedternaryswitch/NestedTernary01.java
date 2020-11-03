package day06nestedternaryswitch;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int result = num>=0 ? (num>9 && num<=99) ? (num*num) : (num*num*num) :(num<-10) ? num : -1*num;
		System.out.println(result);

		scan.close();
	}

}
