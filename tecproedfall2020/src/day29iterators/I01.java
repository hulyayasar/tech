package day29iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class I01 {

	public static void main(String[] args) {
		 List<String> list1 = new ArrayList<>();
		 list1.add("A");
		 list1.add("C");
		 list1.add("B");
		 
		 for (String w : list1) {
			 System.out.print(w + " ");
		}
		 
		 System.out.println();
		 
		 Iterator<String> it1 = list1.iterator();
		 while(it1.hasNext()) {
			it1.next();
			it1.remove();
		 }
		 System.out.println(list1);
		
	}

}
