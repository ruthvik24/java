import java.util.*;
import java.lang.*;
import java.io.*;

class Test{
	public static void main(String args[]) throws java.lang.Exception{

BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
      
      int t =scanner.nextInt();
    
    while(t-- >0){
        int n = scanner.nextInt();
        scanner.nextLine();
      	String input = scanner.nextLine();    // get the entire line after the prompt 
     	String[] s = input.split(" ");
     	
     	boolean service = false;
     	
    
     	for(int i=0; i< n; i++) {
     	    String p = s[i];
     	    if(p.equals("start")){
     	        service = true;
     	    }
     	    else if(p.equals("restart")){
     	        service = true;
     	    }
     	    else if((p.equals("stop") && service == false )){
     	        System.out.println(404);
     	        break;
     	    }
     	    else if((p.equals("stop")) && (service == true) && (i+1 == n)){
     	    	service = false;
     	    	System.out.println(200);
     	    	break;
     	    }
     	    else {
     	       System.out.println(404);
			   service = false;
     	    }
     	  
     	}
     	
    
    
    }
}}