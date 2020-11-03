package Day32CollectionsMaps;

import java.util.ArrayList;
//import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
//import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		lhs1.add(21);
		lhs1.add(25);
		lhs1.add(22);
		lhs1.add(29);
		lhs1.add(24);
		System.out.println(lhs1);
		
		//1.way
		int i=0;
		for( Integer w : lhs1) {
			if(i==2) {
			System.out.println(w);	
			}
			i++;
		}
		//2.way
		Integer arr[] = new Integer[lhs1.size()];
		arr=lhs1.toArray(arr);
		System.out.println(arr[2]);
		
		//3.way
		List<Integer> l1 = new ArrayList<>(lhs1);
		l1.get(2);
		
		//4.way
		get(lhs1);
		
		
	}
	
	public static void get(LinkedHashSet<Integer> lhs1 ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index");
		int idx=scan.nextInt();
		int currentIndex = 0;
		Iterator<Integer> it1 = lhs1.iterator();
		while(it1.hasNext()) {
			
			Integer el = it1.next();
			
			if(currentIndex == idx) {
				System.out.println("The element at index " + idx + " is " + el);
			}
			
			currentIndex++;
		}
		scan.close();
	}

}
