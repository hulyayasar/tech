package day25exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream("src/day25exceptions/TextFil");
			
			int k;
			while((k=fis.read()) != -1) {
				System.out.print((char)k);
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Path is wrong or the file is deleted");
		}
		catch(IOException e){
			
			System.out.println("The file could not be read");
		}
		finally {
			System.out.println("I am in finally block");
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("The file could not be closed");
			}
		}

		
	}

}
