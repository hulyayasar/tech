package day15Arrays;

public class H2 {

	public static void main(String[] args) {
		
		String s = "I like Java but Java needs to study hard to learn so study hard";
		
		
		char diffletters []= new char[s.length()];
		char arr[] = new char[s.length()];
		
		int check = 0,m=0;
		
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		
		for(int i=0 ; i<arr.length;i++) {
			
			int counter =0;
			
			for(int k=i+1;k<arr.length;k++) {
				
				if(arr[i]== arr[k]) {
					counter++;
				}
				
			}
			if(counter==0) {
				check++;
				diffletters[m]=arr[i];
				m++;
			}
			
		}
		for(int h=0;h<m;h++) {
			System.out.print(diffletters[h] + " ");
		}
		
		System.out.println();
		System.out.println(check);
	
		
		
		
		
		
		
		
		
		

	}

}
