package com.filehandling.com;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class File02 {
	public static void main(String[] args) {
		 
		FileReader     in = null;         
		BufferedReader bf = null;        
			try {
	    	
				List<String>lines = new ArrayList<String>();
		    	
		        in= new FileReader("text.txt");
		        bf = new BufferedReader(in);
		     
		        String line = bf.readLine();
		     
		        while (line != null) {     // to read text into line by line 
		    	   lines.add(line);
		    	   
		    	   line = bf.readLine();
		    	   
		    	   if(line == null)
		    		   break;
		         
		       }
		       
		       String[] str = lines.toArray(new String[lines.size()]);  
		       for(String s : str)
		    	   System.out.println("\n\n" + s);
		    
			   }
		    
		       catch(FileNotFoundException ex) {
		    	  System.out.println(ex.getMessage());
		       }
		       catch(IOException ex) {  
		    	  System.out.println(ex.getMessage());  
		       }

	    		finally {
	    			try {
	    			
	    				if(in!=null)
	    					in.close();

	    				if(bf !=null)
	    					bf.close();
	    				}
	    		
	    		catch(IOException ex){
	    			ex.printStackTrace();
	    			
	    		}
	    	}
		}

}
