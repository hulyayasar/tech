package day30Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList<String> ll1 =new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Mary");
		ll1.add("Angie");
		ll1.add("Tom");
		
		System.out.println(ll1);
		
		ll1.add(1, "Alex");
		
		System.out.println(ll1);
		
		ll1.addFirst("AAA");
		
		System.out.println(ll1);
		
		ll1.addLast("ZZZ");
		
		System.out.println(ll1);
		
		
		//LinkedList<String> ll2 =new LinkedList<>();
		ArrayList<String> ll2 = new ArrayList<>();
		ll2.add("AAA");
		ll2.add("Alex");
		ll2.add("ZZZ");
		ll2.add("Alex");
		
		ll1.addAll(ll2);
		System.out.println(ll1);
		
		ll1.addAll(3, ll2);
		System.out.println(ll1);
		
		System.out.println(ll1.remove());
		System.out.println(ll1);
		
		System.out.println(ll1.remove(3));
		System.out.println(ll1);
		
		ll1.remove("Tom");
		System.out.println();
		
		if(ll1.remove("Alex")) {
			System.out.println("Alex exists and removed");
		}
		else {
			System.out.println("Alex does not exist");
		}
		
		System.out.println(ll1.removeFirst());
		System.out.println(ll1);
		
		System.out.println(ll1.removeLast());
		System.out.println(ll1);
		
		
		System.out.println(ll1.removeFirstOccurrence("Alex"));
		System.out.println(ll1);
		
		System.out.println(ll1.removeLastOccurrence("Angie"));
		System.out.println(ll1);
		
		LinkedList<String> ll3 =new LinkedList<>();
//		ll3.add("Alex");
//		ll3.add("Angie");
		ll1.add("NNN");
		
		System.out.println(ll1.removeAll(ll3));
		System.out.println(ll1);
		
		
		
	}

}
