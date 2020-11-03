package day31Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet01 {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Can");
		hs1.add("Mary");
		hs1.add("Frank");
		hs1.add("Angie");
		hs1.add("Ali");
		hs1.add(null);
		System.out.println(hs1);//[Can, Angie, Frank, Ali, Mary]
		
		System.out.println(hs1.contains("Ali"));
		
		List<String> l1 = new ArrayList<>();
		l1.add("Mary");
		l1.add("Frank");
		l1.add(null);
		l1.add("YYY");
		
		System.out.println(hs1.containsAll(l1));

		System.out.println(hs1.hashCode());
		
		
	}

}
