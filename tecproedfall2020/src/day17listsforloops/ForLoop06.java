package day17listsforloops;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		int arr[][]= new int [num][num];
		
		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<num;i++) {
			for(int h=0;h<num;h++) {
				arr[i][h]=num;
			}
		}
		System.out.println(Arrays.deepToString(arr));
		
		scan.close();
	}

}
