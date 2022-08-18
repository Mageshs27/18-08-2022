package com.filehandling.com;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class File01 {
	public static void main(String[] args) {
		
		FileReader in = null;    
		BufferedReader br = null; 
								 

		try {  
			
		 in = new FileReader("text.txt"); 
		 br = new BufferedReader(in); 
		
		String li;  
		
		while((li = br.readLine())!=null) { 
			System.out.println(li);  
		
		}  
		
		} 
		
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		
		catch(IOException ex) { 
			System.out.println(ex.getMessage());
		
	   } 
		
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			try {
				if(in != null)
					in.close();
				
				if(br != null)
					br.close();
				
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
		}
		
	} 
}


