package day17listsforloops;

import java.util.ArrayList;
import java.util.List;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 for-each-loop is the updated version of for-loop
		 it is easy to type
		 it is easy to read
		 it eliminates the possible programmer errors
		 */
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(13);
		list1.add(15);
		list1.add(12);
		list1.add(14);
		System.out.println(list1);
		
		for(int i=0 ; i<list1.size();i++) {
			System.out.print(list1.get(i) + " ");
		}
		
		System.out.println();
		
		for(Integer w : list1) {
			System.out.print(w + " ");
		}
		
		System.out.println();
		for(Integer w : list1) {
			if(w%2==0)
				System.out.print(w + " ");
		}
		System.out.println();
		
		for(Integer w : list1) {
			
			if(list1.indexOf(w)>=list1.size()-3 ) {
			System.out.print(w + " ");
			}
			
		}
		System.out.println();
		
		for(Integer w : list1) {
			
			if(list1.indexOf(w)<3 ) {
			System.out.print(w + " ");
			
			}
			
		}
		System.out.println();
		
		System.out.println();
		
		for(Integer w: list1.subList(0, 3)) {
			System.out.print(w +" ");
		}
		
		
		
		
		
		
		

	}

}
