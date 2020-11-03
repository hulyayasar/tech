package day31Collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("A");
		lhs1.add("Z");
		lhs1.add("M");
		lhs1.add("B");
		lhs1.add("R");
		
		System.out.println(lhs1);//[A, Z, M, B, R]

	}

}
