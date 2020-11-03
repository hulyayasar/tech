package day17listsforloops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first integer array");
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int i=0 ;i<4 ;i++) {
			list1.add(scan.nextInt());
		}
		for(int h=0 ;h<5 ;h++) {
			list2.add(scan.nextInt());
		}
		
		int counter=0;
		for(Integer w : list1) {
			for(Integer h : list2) {
				if(w==h) {
					counter++;
				}
			}
			if(counter!=0) {
				System.out.print(w  +" ");
			}
		}
		
		scan.close();

	}

}
