package day09loops;

import java.util.Scanner;

public class Forloop01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "Hello word";
		
		for(int i = 1 ; i<7 ; i++) {
			System.out.println(str);
		}
		for(int i = 10 ; i<45 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 44 ; i>9 ; i--) {
			if(i%2==0) {
			System.out.print( i + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 11 ; i<47 ; i++) {
			if(i%2==1) {
			System.out.print( i + " ");
			}
		}

		System.out.println();
		
		for(int i = 1 ; i<500 ; i++) {
			if(i%6==0 && i%6==0) {
			System.out.print( i + " ");
			}
		}
		
		scan.close();
	}

}
