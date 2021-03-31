import java.util.*;  
public class Exam5{  
 public static void main(String args[]){  
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();   
	for(int i = 0; i<n;i++){
		map.put(sc.next(),sc.nextInt());   
	}
    String r = sc.next();
    System.out.println(map); 
		System.out.println(map.get(r));
}  
}  