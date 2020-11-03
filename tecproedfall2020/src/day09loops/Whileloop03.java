package day09loops;

import java.util.Scanner;

public class Whileloop03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num1 = scan.nextInt();
        int res=1;
        int i=1;
        while(i<=num1) {
        	res= res*i;
        	i++;
        }
        System.out.println(res);

        scan.close();
	}

}
