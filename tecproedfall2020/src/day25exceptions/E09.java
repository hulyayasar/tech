package day25exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E09 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/day25exceptions/TextFile");
		fis.close();
		int age =12;
		if(age<0) {
			throw new IllegalArgumentException();
			
		}
		else {
			System.out.println(age);
		}

	}

}
