package day31Collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

	public static void main(String[] args) {

		Deque<String> dq1 = new LinkedList<>();
		dq1.add("Ali");
		dq1.add("Metin");
		dq1.add("Joe");
		dq1.add("Mary");
		dq1.add("Angie");
		System.out.println(dq1);//[Ali, Metin, Joe, Mary, Angie]

		dq1.addFirst("AAA");
		System.out.println(dq1);
		dq1.addLast("ZZZ");
		System.out.println(dq1);
		
		System.out.println(dq1.getFirst());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1);
		
		System.out.println(dq1.getLast());
		System.out.println(dq1.peekLast());
		
		System.out.println(dq1.pollFirst());
		System.out.println(dq1.pollLast());
		
		System.out.println(dq1.removeFirst());
		System.out.println(dq1.removeLast());
		
		dq1.clear();
		System.out.println(dq1);
		//dq1.getFirst();  		Exception
		System.out.println(dq1.peekFirst());
		
		
	}

}
