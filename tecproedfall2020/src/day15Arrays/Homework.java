package day15Arrays;

public class Homework {

	public static void main(String[] args) {
		//how many different char i used in a string 

		String s = "I like Java but Java needs to study hard to learn so study hard";
		
		
		int check = 0;
		
		for(int i=0 ; i<s.length();i++) {
			int counter =0;
			
			for(int k=i+1;k<s.length();k++) {
				
				if(s.charAt(i)== s.charAt(k)) {
					counter++;
				}
				
			}
			if(counter==0) {
				check++;
			}
			
		}
		
		System.out.println(check);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
