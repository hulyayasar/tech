package day29iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		 List<String> list2 = new ArrayList<>();
		 list2.add("AB");
		 list2.add("CD");
		 list2.add("EF");
		 
		 ListIterator<String> it2 = list2.listIterator();
		 while(it2.hasNext()) {
			 String el = it2.next();
			System.out.print(el + " ");
			
			it2.set(el + "!");
			
		 }
		 System.out.println();
		 System.out.println(list2);
		 
		 List<String> list3 = new ArrayList<>();
		 list3.add("XY");
		 list3.add("ZT");
		 list3.add("UV");
		 System.out.println(list3);
		 
		 ListIterator<String> it3 = list3.listIterator();
		 
		 while(it3.hasNext()) {
			 it3.next();
		 }
		 
		 while(it3.hasPrevious()) {
			 String el=it3.previous();
			 System.out.print(el + " ");
		 }
		 
		 
	}

}
