import java.io.*; 

public class Charan
{ 
  public static void main(String[] args) throws Exception 
  { 
     File f = new File("C:\\Users\\Ruthvik\\Desktop\\data.txt"); 
        if (f.exists()) 
            System.out.println("Exists"); 
        else
            System.out.println("Does not Exists"); 

    FileReader fr = new FileReader("C:\\Users\\Ruthvik\\Desktop\\data.txt"); 
  
    int i; 
    while ((i=fr.read()) != -1) 
      System.out.print((char) i); 
  } 
} 