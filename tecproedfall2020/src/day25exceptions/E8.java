package day25exceptions;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		
		int numOfEggs =12;
		
		if(numOfEggs<0) {
			throw new IllegalArgumentException("Number of eggs cannot be negative ");
		}
		else {
			System.out.println(numOfEggs);
		}
		
		//------------------------------------------------------------------------------
		
		//String s="1a2b";
		String s ="12";
		boolean r=true;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>=0 && s.charAt(i)<=9)) {
				r=false;
			}
		}
		
		if (r) {
			throw new NumberFormatException("Some characters are not digits");
		}
		else {
			int result = Integer.parseInt(s);
			System.out.println(result+1);
		}
		
		//------------------------------------------------------------------------------
		
		//String v= null;
		String v= "hey";
		if(v.equals(null)) {
			throw new NullPointerException("For null object do not use length()");
		}
		else {
			System.out.println(v.length());
		}
		
		//------------------------------------------------------------------------------
		
		int arr[]= {11,22,13};
		Scanner scan = new Scanner(System.in);
		System.out.println("Which index you want to use?");
		int idx=scan.nextInt();
		if(idx<0 || idx>arr.length) {
			//throw new ArrayIndexOutOfBoundsException("Use valid index");
		}
		else {
			System.out.println(arr[idx]);
		}
		scan.close();
		//------------------------------------------------------------------------------
		/*
		 Between the primitives you can do "explicit narrowing" but for some classes
		 explicit narrowing does not work.For example, you cannot cast Object class object 
		 to a String class object. If you insist to convert an object from Object Class to
		 String Class you will get ClassCastException
		 */
		Object obj = new Object();
		String str=(String)obj;
		System.out.println(str);
		
//		Integer a  = new Integer(4);
//		Short b = (Short)a;
//		
		
	}

}
