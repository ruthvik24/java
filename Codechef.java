/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	   
	      int t = Integer.parseInt(read.readLine());
        
        while(t-- >0){
	  String s= read.readLine();
		
       	int a = s.indexOf('P');
	int b = s.indexOf('C');
	int c = s.indexOf('M');
	if(a+b+c == 3) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
		
	}
	
	}
}