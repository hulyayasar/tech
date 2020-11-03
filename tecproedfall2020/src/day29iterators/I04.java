package day29iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class I04 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ListIterator<Integer> it = list.listIterator();
		
		int i=0;
		while(it.hasNext()) {
			int n=it.next();
			 if(i>2) {
				 it.next();
			 }
			 else {
				 it.set(n=n*2);
				 i++; 
			 }
			 
			 
		 }
		
		while(it.hasPrevious()) {
			 int el=it.previous();
			 
			 System.out.print(el + " ");
			 
		 }
		System.out.println();
		Collections.reverse(list);
		System.out.println(list);

	}

}
