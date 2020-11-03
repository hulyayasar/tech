package day19varargsaccessmodifierdt;

public class Varargs01 {
	/*
	  1)Varargs must be initialize as a last parameter in a method parenthesis
	  2)You cannot use more than 1 varargs in a method parenthesis
	 */
	

	public static void main(String[] args) {
		add(5,7);
		add(5,7,6);
		
		addByVarargs();
		addByVarargs(2);
		addByVarargs(2,4,5,6);
		
		multiplyByVarargs("Result: ",2,3,4,5);
	}
	
	public static void add(int n1,int n2) {
		System.out.println(n1+n2);
		
	}
	
	public static void add(int n1,int n2,int n3) {
		System.out.println(n1+n2+n3);
		
	}
	
	public static void addByVarargs(int... a) {
		int sum=0;
		for(int w: a) {
			sum+=w;
		}
		System.out.println(sum);
	}
	
	public static void multiplyByVarargs(String s,double... b) {
		int product=1;
		for(double w: b) {
			product*=w;
		}
		System.out.println(s+product);
	}

}
