package day18PassByValuePassByReferenceDateTime;

import java.util.ArrayList;
import java.util.List;

public class PassByValueAndReference {

	public static void main(String[] args) {
		int y=5;
		square(y);
		System.out.println(y);
		
		String s="Ali";
		System.out.println(concat(s));
		System.out.println(s);
		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		System.out.println(list);
		System.out.println(increase(list));
		System.out.println(list);

	}
	
	public static void square (int num) {
		System.out.println(num*num);
	}
	
	public static String concat(String s) {
		return s+"*";
	}
	
	public static List<Integer> increase(List<Integer> list) {
			list.add(3);
		
		return list;
		
	}

}
