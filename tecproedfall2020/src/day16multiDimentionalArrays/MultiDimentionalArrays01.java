package day16multiDimentionalArrays;

import java.util.Arrays;

public class MultiDimentionalArrays01 {

	public static void main(String[] args) {
		
		int ma[][] = new int [3][2];
		System.out.println(Arrays.deepToString(ma));
		
		ma[0][1]=2;
		
		int count=1;
		for(int i = 0; i<ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				ma[i][j]=count;
				System.out.print(ma[i][j] + " ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(Arrays.deepToString(ma));
		
		System.out.println(ma[2][1]);
		System.out.println();

		
		int maa[][]= {{1},{3,4},{5,6,7}};
		
		
		
		for(int i=0;i<maa.length;i++) {
			for(int k=0;k<maa[i].length;k++) {
				System.out.print("*" + maa[i][k] );
				
			}	
		}
		System.out.println();
		int product=1;
		for(int i=0;i<maa.length;i++) {
			for(int k=0;k<maa[i].length;k++) {
				product*= maa[i][k] ;
				
			}	
		}
		System.out.println(product);
		
		
		//how to find the sum of all elements
		int sum=0;
		for(int i=0;i<maa.length;i++) {
			for(int k=0;k<maa[i].length;k++) {
				sum+= maa[i][k] ;
				
			}	
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	
		
	}

}
