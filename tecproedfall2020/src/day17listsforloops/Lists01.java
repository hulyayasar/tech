package day17listsforloops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Mary");
		list1.add(1,"Angie");
		list1.add("Veli");
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.get(3));
		System.out.println(list1.contains("Veli"));
		System.out.println(list1.contains("XXX"));
		
		System.out.println(list1.indexOf("Veli"));
		
		System.out.println(list1.lastIndexOf("Veli"));
		
		list1.remove(1);
		System.out.println(list1);
		System.out.println(list1.remove(1));
		System.out.println(list1);
		
		String s = "Java ohh Java";
		s.replace("a", "");
		
		list1.remove("Veli");
		System.out.println(list1);
		System.out.println(list1.remove("Veli"));//true
		
		list1.add("Mary");
		list1.add("Mary");
		list1.add("Mary");
		list1.add("Ali");
		list1.add("John");
		System.out.println(list1);
		
		list1.set(2, "Ahmet");
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		List<String> list3 = new ArrayList<>();
		
		for(int i=0;i<list2.size();i++) {
			list3.add(list2.get(i) +"*");
			
		}
		System.out.println(list3);
		
		
		System.out.println(list1.subList(2, 5));
		
		list1.addAll(list3);
		System.out.println(list1);
		
		list1.addAll(3, list3);
		System.out.println(list1);
		
		list3.removeAll(list1);
		System.out.println(list3);
		
		list2.clear();
		System.out.println(list2);
		
		list3.add("X");
		list3.add("Ali");
		list3.add("Jack");
		System.out.println(list3);
		
		System.out.println(list1.containsAll(list3));
		
		Collections.sort(list1);
		System.out.println(list1);
		
	}

}
