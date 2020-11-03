package day16multiDimentionalArrays;

import java.util.ArrayList;
import java.util.List;


public class Lists01 {

	public static void main(String[] args) {
		
		//1.way
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println(list1);
		
		//2.way
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println(list2);
		
		//3.way: The best way to use
		//Note: Do not use "List<>" on the right, Java complains 
		List<Integer> list3 = new ArrayList<>();
		
		list3.add(11);
		list3.add(9);
		list3.add(12);
		
		list3.add(1, 123);
		list3.add(0, 77);
		
		System.out.println(list3);
		
		
		System.out.println(list3.size());
		
		System.out.println(list3.get(list3.size()-1));
		
		System.out.println(list3.contains(77));
		System.out.println(list3.contains(99));
		
		
		
		
		
	}

}
