package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an intger");
		int num = scan.nextInt();
		
		//if-else statement
		if(num%2==0) {System.out.println("Even");} else {System.out.println("Odd");}

		//ternary
				//Condition   QuestionMark   CodeForTrueCondition    Colon     CodeForFalseOne
String result =	num%2==0  		? 				"Even" 					: 			"Odd";
		System.out.println("Ternary: " + result);
		
		System.out.println(num>0 ? "Positive" : -1);
			
		scan.close();
	}

}
