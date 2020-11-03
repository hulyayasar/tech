package day31Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		long startingTime1=System.currentTimeMillis();
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Brad Pitt");
		ts1.add("Angelina Julie");
		ts1.add("Tom Mark");
		ts1.add("Arnold Schwardzannegger");
		ts1.add("cuneyt arkin");
		ts1.add("kemal sunal");
		ts1.add("ahmet yildiz");
		ts1.add("Ali Can");
		
		System.out.println(ts1);
		long endingTime1=System.currentTimeMillis();
		System.out.println(endingTime1-startingTime1);
		
		HashSet<String> hs1 = new HashSet<>();
		long startingTime2=System.currentTimeMillis();
		hs1.add("Brad Pitt");
		hs1.add("Angelina Julie");
		hs1.add("Tom Mark");
		hs1.add("Arnold Schwardzannegger");
		hs1.add("cuneyt arkin");
		hs1.add("kemal sunal");
		hs1.add("ahmet yildiz");
		hs1.add("Ali Can");
		
		TreeSet<String> ts2 = new TreeSet<>(hs1);
		
		System.out.println(ts2);
		long endingTime2=System.currentTimeMillis();
		System.out.println("HashSet: " +(endingTime2-startingTime2));
		
		
	}

}
