package hwfromday17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubarrays {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = new ArrayList<>();

		
		
		for(int i=0;i<4;i++) {
			
			for(int k=i;k<4;k++) {
				
				for(int l=i;l<=k;l++) {
					
					list.add(arr[l]);
				}
			}
		}
		System.out.println(list);

	}

}
