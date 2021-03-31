import java.util.*;
import java.lang.*;

class example extends Thread 
{ 
    public void run() 
    { 
        try
        { 
            System.out.println (Thread.currentThread());
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 

public class Main 
{ 
    public static void main(String[] args) 
    { 
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
		String n = s.next();
        for (int i=0; i<num; i++) 
        { 
            example object = new example(); 
            object.start();
            object.setName(n);
        } 
    } 
} 
