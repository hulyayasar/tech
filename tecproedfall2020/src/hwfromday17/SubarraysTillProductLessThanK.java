package hwfromday17;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
//import java.util.Scanner;

public class SubarraysTillProductLessThanK {

	public static void main(String[] args) {
		
		int K = 7;
		
		int arr[]= {2,7,1,4};
		
		System.out.println(Arrays.toString(arr));
		
		List<List<Integer>> solution = new ArrayList<>();
		
		int product=1;
		int start=0;
		for(int k=0;k<arr.length;k++) {
			
			product*=arr[k];
			
			while(product>K) {
				product/=arr[start];
				start++;
			}
			
			List<Integer> list = new ArrayList<>();
			
			for(int i=k;i>=start;i--) {
				list.add(0, arr[i]);
				
				solution.add(new ArrayList<>(list));
			}
			
		
		}
		System.out.println(solution);

	}

}
