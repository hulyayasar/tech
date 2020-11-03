package day15Arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int arr1[] = new int [4];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		System.out.println(Arrays.toString(arr1));
		 char arr2[] = {'a','b','c','d','e','f'};
		System.out.println(Arrays.toString(arr2));
		
		char arr3[] = new char[6];
		int k=0;
		for(int i=arr2.length-1;i>=0;k++,i--) {
			
			arr3[i]=arr2[k] ;
		}
		System.out.println(Arrays.toString(arr3));
		
		for(int i=0;i<arr2.length;i++) {
			if(i%2==0) {
				System.out.println(arr2[i]);
			}
		}
		
		String str[] = new String[5];
		str[0]= "hello";
		str[1]="ali";
		str[2]="how";
		str[3]="are";
		str[4]="you";
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		//binarySearch() is used to check if an element exists in an array or not.
		//before using binarySearch(), you HAVE TO use sort()
		
		String str2[] = {"Adem","Adem","John","Adem","Leo","Brad"};
		
		Arrays.sort(str2);
		System.out.println(Arrays.binarySearch(str2, "Adem"));
		
		
		
		
		
		

	}

}
