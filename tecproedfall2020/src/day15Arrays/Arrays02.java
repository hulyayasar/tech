package day15Arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		int a[]= {2,7,1,3};
		int b[]= {7,2,1,3};
		int c[]= {2,7,1,3};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));
		
		String s = "I like Java but Java needs to study hard to learn so study hard";
		
		String words[]= s.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		System.out.println(words[4]);
		
		//the char which you used in split() will not be displayed in the array
		String words2[]= s.split("t");
		System.out.println(Arrays.toString(words2));
		
		s=s.replace(" ", "");
		String words3[]= s.split("");
		System.out.println(Arrays.toString(words3));
		System.out.println(words3.length);
		
		int counter =0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equals("b")) {
				counter++;
			}
		}
		System.out.println(counter);
		
		
		
		
		
		
		
		
		

	}

}
