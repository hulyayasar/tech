package day17listsforloops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list1 = new ArrayList<>();
		
		for(int i=0 ;i<7 ;i++) {
			list1.add(scan.nextLine());
		}
		
		List<String> list2 = new ArrayList<>();
		
		for(String w : list1) {
			if(!list2.contains(w)) {
				list2.add(w);
			}
			
		}
		System.out.println(list1);
		System.out.println(list2);

		scan.close();
	}

}
