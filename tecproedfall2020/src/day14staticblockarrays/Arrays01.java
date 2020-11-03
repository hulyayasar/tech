package day14staticblockarrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int a[] = new int[6];
		a[0]=13;
		a[1]=10;
		a[2]=11;
		a[3]=25;
		//a[4]=31;

		System.out.println(a[0]);
		System.out.println(Arrays.toString(a));
		
		String s[]=new String[3];
		s[0]="Ali";
		s[2]="Veli";
		System.out.println(s[2]);
		
		double d[]= new double[5];
		d[0]=1.1;
		d[1]=2.1;
		d[2]=3.1;
		d[3]=4.1;
		d[4]=5.1;
		
		for(int i=0; i< d.length;i++) {
			System.out.print(d[i] + "-");
		}
		
		
	}

}
