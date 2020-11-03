package day17listsforloops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		String s[] = {"A","C","M","B"};
		
		List<String> ls = Arrays.asList(s);
		
		System.out.println(ls.size());
		//ls.remove(1);
		
		List<String> nls = new ArrayList<>();
		for(int i=0;i<s.length;i++) {
			nls.add(s[i]);
		}
		System.out.println(nls);
		nls.remove(1);
		
		String arrFromList[] =nls.toArray(new String[0]);
		System.out.println(Arrays.toString(arrFromList));
		

	}

}
