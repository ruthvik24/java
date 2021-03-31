import java.lang.*; 
public class Main3 extends Thread
{
    public static void main(String[]args) 
    { 
        Main3 t1 = new Main3();
        t1.setPriority(11);
        System.out.println(t1.getPriority());
    }    
}
