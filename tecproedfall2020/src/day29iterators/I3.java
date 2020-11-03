package day29iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class I3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		ListIterator<Integer> it = list.listIterator();
		
		while(it.hasNext()) {
			it.next();
			 
			 
		 }
		while(it.hasPrevious()) {
			 int el=it.previous();
			 it.set(el=el+2);
			 System.out.println(el + " ");
			 
		 }
		Collections.reverse(list);
		System.out.println(list);
		 
		
		 
		

	}

}
