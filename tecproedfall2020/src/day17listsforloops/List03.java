package day17listsforloops;

import java.util.ArrayList;

import java.util.List;

public class List03 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		list.add(0,11);
		list.add(3,13);
		System.out.println(list);
		
		for(int h=0;h<list.size();h++) {
			list.set(h, list.get(h) + 3);
		}
		System.out.println(list);
		
		int mult=1;
		for(int f=2;f<6;f++) {
			mult*=list.get(f);
			
		}
		System.out.println(mult);
		System.out.println(list);
		
		
	}

}
